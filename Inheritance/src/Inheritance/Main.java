package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Exception  {
		String  species;
		String  locomotionType;
		boolean hasHeatResistance;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Species Name : ");
		species=sc.next();
		System.out.print("Enter locomotion type : ");
		locomotionType=sc.next();
		System.out.println("Is it heat resistant?");
		//hasHeatResistance=sc.nextBoolean();
		hasHeatResistance=sc.hasNext("yes");
		LavaDino d=new LavaDino(species,locomotionType,hasHeatResistance);
		d.display();

	}

}
