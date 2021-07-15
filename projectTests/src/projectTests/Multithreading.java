package projectTests;

public class Multithreading {
	public static void main(String[] args) throws Exception{//general exceptions
		//using thread class
		Worker w1 = new Worker();
		w1.start();//method to start a Thread
		//calls the run method internally, does not need to 
		//assigned by dot operator
		Worker w2 = new Worker();
		w1.join();
		w2.start();
		
		
		//using runnable interface for threads
//		Thread t1 = new Thread(new TaskExecuter());
//		Thread t2 = new Thread(new TaskExecuter());
//		t1.start();
//		t2.start();
	}
}

class Worker extends Thread{
	
	public void run() {
		System.out.println("Running thread ["+getName()+"]....");
		for (int i=0;i<5;i++) {
			System.out.println("["+getName()+"]" + i);
			try {
				sleep(500);//pauses the thread for 500 ms
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class TaskExecuter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running thread....");
	}
	
}