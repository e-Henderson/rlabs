package one;

public class ProtectedClass {
	protected long id = 1l;//declares protected long variable
	protected void printID() {//this method will then print the id. 
		System.out.println(this.id);
	}
	/*
	 * protected means that only classes in the same package or any
	 * subclass of the package will have access. It is not like public where
	 * any class from any package can access it. 
	 */
}
