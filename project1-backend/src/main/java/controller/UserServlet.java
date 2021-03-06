package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.model.User;
import common.util.AppConst;
import common.util.HttpUtil;
import manager.UserManager;

@WebServlet("/users/*")
public class UserServlet extends HttpServlet{
	
	private UserManager um = new UserManager();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String jsonInString = null;
		ObjectMapper mapper = new ObjectMapper();

		String[] pathVariables = HttpUtil.getPathVariables(req);
		
		if(pathVariables == null || pathVariables.length == 0) {
			//get data from backend
			List<User> users = null;
			//transform java object to JSON string
			jsonInString = mapper.writeValueAsString(users);
		} 
		// GET /menus/:id
		// fetch individual menu item
		if(pathVariables != null && pathVariables.length == 2) {
			//get data from backend
			
		}
		
		//send success response to client
		resp.getWriter().print(jsonInString);
		resp.setContentType(AppConst.HTTP_JSON_CONTENT);
		resp.setStatus(AppConst.HTTP_OK);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//is it as simple that I don't have every needed paramter fille, I don't need the id since it's a serial 
		try {
			//get JSON data from HTTP body
			ObjectMapper mapper = new ObjectMapper();
			User user = mapper.readValue(HttpUtil.getJSONData(req), User.class);
			//persist data to backend
			um.create(user);
			//send success response to client
			String jsonResponse = mapper.writeValueAsString(user);
			resp.getWriter().print(jsonResponse);
			resp.setStatus(AppConst.HTTP_OK);
		} catch (Exception e) {
			//send failure response to client
			resp.getWriter().print(HttpUtil.getErrorMessage(e.getMessage()));
			resp.setStatus(AppConst.HTTP_ERROR);
		}

		resp.setContentType(AppConst.HTTP_JSON_CONTENT);

	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] pathVariables = HttpUtil.getPathVariables(req);
		// GET /menus/:id
		// fetch individual menu item
		if(pathVariables != null && pathVariables.length == 2) {
			//get data from backend
			int id = Integer.parseInt(pathVariables[1]);
			//manager.delete(id);
			resp.setStatus(AppConst.HTTP_OK);
		}
	}
}
