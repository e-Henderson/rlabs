package fixtures;

public class PictureFrames extends Fixture implements Interactable{

	public PictureFrames(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		System.out.println("You look at the picture frames. They contain family photos.");
	}
	

}
