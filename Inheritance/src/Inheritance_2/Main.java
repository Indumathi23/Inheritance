package Inheritance_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String species;
		String locomotionType;
		float  locomotionSpeed;
		int numberOfWings;
		float speedPerWing;
		float ashResistance;
		int  numberOfFins;
		float numberOfTails;
		float lavaMultiplier;
		int  numberOfLegs;

		//float speed;
		System.out.printf("1.Land Dino\n2.Aqua Dino\n3.AirLava Dino\n");
		System.out.println("Enter the choice : ");
		int n=sc.nextInt();
		System.out.println("Enter Species name :");
		species=sc.next();
		System.out.println("Enter Locomotion type :");
		locomotionType=sc.next();
		System.out.println("Enter Locomotion speed :");
		locomotionSpeed=sc.nextFloat();
		//System.out.println(locomotionSpeed);
		switch(n)
		{
		case 3:
			System.out.println("Enter number of wings :");
			numberOfWings=sc.nextInt();
			System.out.println("Enter speed per wing :");
			speedPerWing=sc.nextFloat();
			System.out.println("Enter Ash resistance:");
			ashResistance=sc.nextFloat();
			AirLavaDino d=new AirLavaDino(species,locomotionType,locomotionSpeed,numberOfWings,speedPerWing,ashResistance);
			d.display();
		break;
		case 1:
			System.out.println("Enter no. of legs : ");
			numberOfLegs=sc.nextInt();
			LandLavaDino d1=new LandLavaDino(species,locomotionType,locomotionSpeed,numberOfLegs);
			d1.display();
			break;
		case 2:
			System.out.println("Enter  Number of fins:");
			numberOfFins=sc.nextInt();
			System.out.println("Enter Number of trails:");
			numberOfTails=sc.nextFloat();
			System.out.println("Enter Lava multiplier :");
			lavaMultiplier=sc.nextFloat();
			WaterLavaDino w=new WaterLavaDino(species,locomotionType,locomotionSpeed,numberOfFins,numberOfTails,lavaMultiplier);
			w.display();
			break;
		}
		

	}



}
