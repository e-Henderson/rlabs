package projectTests;

import java.util.ArrayList;
import java.util.List;

public class Multithreading {
	public static void main(String[] args) throws Exception{//general exceptions
		//using thread class
		Worker w1 = new Worker();
		w1.start();//method to start a Thread
		//calls the run method internally, does not need to 
		//assigned by dot operator
		Worker w2 = new Worker();
		//w1.join();//starts a thread, waits until first thread to die then the second thread will start
		w2.start();
		
		
		//using runnable interface for threads
//		Thread t1 = new Thread(new TaskExecuter());
//		Thread t2 = new Thread(new TaskExecuter());
//		t1.start();
//		t2.start();
	}
}

class Worker extends Thread{
	
	List<String> sharedResource = new ArrayList<String>();
	
	public void run() {
		System.out.println("Running thread ["+getName()+"]....");
		for (int i=0;i<5;i++) {
			System.out.println("["+getName()+"]" + i);
			
			try {
				sleep(500);//pauses the thread for 500 ms
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		synchronized(sharedResource) {//synchs resources within the thread
		
			registerUser();
		}
	}
	void registerUser() {
		//data read
		sharedResource.add("Test");
		//update is done
	}
	
}

class TaskExecuter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running thread....");
	}
	
}