package Inheritance_2;

public class WaterLavaDino extends LavaDino{
	private int  numberOfFins;
	private float numberOfTails;
	private float lavaMultiplier;
	public WaterLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfFins,float numberOfTails, float lavaMultiplier) {
		super(species,locomotionType,locomotionSpeed);
		this.numberOfFins=numberOfFins;
		this.numberOfTails=numberOfTails;
		this.lavaMultiplier=lavaMultiplier;
		}
	public int getNumberOfFins() {
		return numberOfFins;
	}
	public void setNumberOfFins(int numberOfFins) {
		this.numberOfFins = numberOfFins;
	}
	public float getNumberOfTails() {
		return numberOfTails;
	}
	public void setNumberOfTails(float numberOfTails) {
		this.numberOfTails = numberOfTails;
	}
	public float getLavaMultiplier() {
		return lavaMultiplier;
	}
	public void setLavaMultiplier(float lavaMultiplier) {
		this.lavaMultiplier = lavaMultiplier;
	}
	public void display()
	{
		super.display();
		float speed = getLocomotionSpeed()+((float)numberOfFins+numberOfTails)*lavaMultiplier;
		System.out.println("WaterLava Dino speed :"+speed);
	}
	

}
