package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.Workers;
import common.util.AppConst;
import common.util.HttpUtil;
import manager.WorkerManager;

@WebServlet("/workers/*")
public class WorkersServlet extends HttpServlet{
	private WorkerManager wm =new WorkerManager();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException{
		
		//the following code might start causing problems
		String jsonInString = null;
		ObjectMapper mapper = new ObjectMapper();//allows for reading and writing to JSON
		
		String[] pathVariables = HttpUtil.getPathVariables(req);
		//above is parsing the url to get whatever needs to be seen
		
		if(pathVariables == null || pathVariables.length==0) {
			//the following gets data from the backend
			List<Workers> workers = wm.findAll();
			//then the java object is transmuted to a json string
			jsonInString=mapper.writeValueAsString(workers); 
			
		}
		
		//get /workers/:login
		if(pathVariables != null && pathVariables.length==2) {//might need to change the 2
			//data from backend
			//I'm curious if the below line will actually work
			//try with a null method for the employee
			//or just create a user and login class for this specific purpose. Maybe combine the two inot one class
			String uName = null;//String.parse(pathVariables[1]);//these are problems. typecast them?
			String pWord = null;//Integer.parseString(pathVariables[2]);//Integer or String?
			Workers worker = wm.findByLogin(uName, pWord);//this is now problem
			
			//transform to java object to JSON string
			if(worker != null) {
				jsonInString=mapper.writeValueAsString(worker);
			}else {
				jsonInString = HttpUtil.getErrorMessage("Worker not found");
			}
			
		}
		//success responses
		res.getWriter().print(jsonInString);
		res.setContentType(AppConst.HTTP_JSON_CONTENT);
		res.setStatus(AppConst.HTTP_OK);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException,IOException{
		try {
			ObjectMapper mapper = new ObjectMapper();
			Workers worker = mapper.readValue(HttpUtil.getJSONData(req),Workers.class);
			//persist data
			wm.create(worker);
			//send success!
			String jsonResponse = mapper.writeValueAsString(worker);
			res.getWriter().print(jsonResponse);
			res.setStatus(AppConst.HTTP_ERROR);
			
		}catch(Exception e) {
			res.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			res.setStatus(AppConst.HTTP_ERROR);
		}
	}
}
