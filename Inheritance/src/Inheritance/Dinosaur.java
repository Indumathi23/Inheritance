package Inheritance;

public class Dinosaur {
	private String  species;
	private String  locomotionType;
	public Dinosaur(String species, String locomotionType) {
		   //super();
		this.species = species;
		this.locomotionType = locomotionType;
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
	

}
