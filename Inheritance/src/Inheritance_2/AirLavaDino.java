package Inheritance_2;

public class AirLavaDino extends LavaDino{
	private int numberOfWings;
	private float speedPerWing;
	private float ashResistance;
	public AirLavaDino(String species, String locomotionType, float locomotionSpeed, int numberOfWings,float speedPerWing, float ashResistance) {
		super(species,locomotionType,locomotionSpeed);
		this.numberOfWings=numberOfWings;
		this.speedPerWing=speedPerWing;
		this.ashResistance= ashResistance;
		
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	public float getSpeedPerWing() {
		return speedPerWing;
	}

	public void setSpeedPerWing(float speedPerWing) {
		this.speedPerWing = speedPerWing;
	}

	public float getAshResistance() {
		return ashResistance;
	}

	public void setAshResistance(float ashResistance) {
		this.ashResistance = ashResistance;
	}

	public void display()
	{
		super.display();
		float s1=((float)getNumberOfWings())*getSpeedPerWing();
		float speed=getLocomotionSpeed()+s1-getAshResistance();
		System.out.println("AirLavaDino speed :"+speed);
	}
	
	
}
