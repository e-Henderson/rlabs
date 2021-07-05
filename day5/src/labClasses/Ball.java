package labClasses;

public class Ball {
	String size;//defining states of the ball obj
	String color;
	
	//define method bounce
	public void bounce() {
		System.out.println("The "+size +" "+color + " ball is bouncing.");
	}
	public static void main(String[] args) {
		//takes class, defines a ref var, and creates obj
		Ball b = new Ball();
		Ball b2 = new Ball();
		
		//declaring initial states
		b.size = "big";
		b.color ="yellow";
		b2.size = "small";
		b2.color = "purple";
		
		//invoke the bounce method
		b.bounce();
		b2.bounce();
		
	}
	
	
	
}
