package Inheritance;

public class LavaDino extends Dinosaur {
	private boolean hasHeatResistance;
	
	public LavaDino(String species, String locomotionType, boolean hasHeatResistance) {
		super(species,locomotionType);
		this.hasHeatResistance=hasHeatResistance;
	}

	public boolean isHasHeatResistance() {
		return hasHeatResistance;
	}

	public void setHasHeatResistance(boolean hasHeatResistance) {
		this.hasHeatResistance = hasHeatResistance;
	}

	void display()
	{
		System.out.println("species : "+getSpecies());
		System.out.println("Travels by "+getLocomotionType());
		//System.out.println(hasHeatResistance);
		if(hasHeatResistance)
		{
			System.out.println("Lives on underground");
		}
		else
		{
			System.out.println("Did not survive");
		}
			
			

		
	}

	/*private boolean HasHeatResistance() {
		
		return true;
	}*/
	}
	
	

