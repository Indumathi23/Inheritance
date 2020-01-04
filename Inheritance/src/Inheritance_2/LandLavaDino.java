package Inheritance_2;

public class LandLavaDino extends LavaDino{
	private int  numberOfLegs;

	public LandLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfLegs) {
		super(species,locomotionType,locomotionSpeed);
		this.numberOfLegs=numberOfLegs;
		}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public void display() {
		super.display();
		float speed=getLocomotionSpeed()*(float)numberOfLegs;
		System.out.println("Land Dino Speed :"+speed);
		
	}

}
