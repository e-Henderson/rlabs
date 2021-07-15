/*package testsPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializingObject {
	public static void main(String[] args) {
		
		Manager m = new Manager("Mike",34,true);
		ObjectOutputStream oos = null;
		
		try { 
			oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
			oos.writeObject(m);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception ignored) {}
		}
		ObjectInputStream ois =null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("object.txt"));
			Object o = ois.readObject();
			System.out.println(o);
			//just look this up after whatever is going on
			System.out.println(m.name);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch (IOException ignored) {}
		}
	}
}

class Manager implements Serializable{
	String name;
	int age;
	boolean senior;
	
	public Manager(String name, int age, boolean senior) {
		this.name=name;
		this.age=age;
		this.senior=senior;
	}
}*/