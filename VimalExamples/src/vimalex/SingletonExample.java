package vimalex;

public class SingletonExample {
	public static void main(String[] args) {
		
		Singleton s =Singleton.getInstance();
		Singleton x =Singleton.getInstance();//don't want to this to happen. No new obj instance	
		//Singleton.getInstance()0;		
	}
}

class Singleton {
	//can be named anything. //used if you only want something once
	
	private static Singleton _instance = null;
	
	private Singleton() {
		//loads properties (files)
	}
	
	public static Singleton getInstance(){
		if(_instance==null) {
			return new Singleton();
		}
		return _instance;
	}
	
}