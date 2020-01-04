package Inheritance_2;

public class LavaDino {
	private String species;
	private String locomotionType;
	private float  locomotionSpeed;
	public LavaDino(String species, String locomotionType, float locomotionSpeed) {
		//super();
		this.species = species;
		this.locomotionType = locomotionType;
		this.locomotionSpeed = locomotionSpeed;
	}
	
	
	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getLocomotionType() {
		return locomotionType;
	}


	public void setLocomotionType(String locomotionType) {
		this.locomotionType = locomotionType;
	}


	public float getLocomotionSpeed() {
		return locomotionSpeed;
	}


	public void setLocomotionSpeed(float locomotionSpeed) {
		this.locomotionSpeed = locomotionSpeed;
	}


	public void display()
	{
		System.out.println("Dino Details : ");
		System.out.println("Name of the species : "+species);//+getSpecies());
		//+getLocomotionSpeed());
	}

}
