package com.training.day4;

public class Gfg {
	public static void main(String[] args) {
		Bicycle cycle = new Bicycle(); 
		cycle.speedUp(3);
		cycle.changeGear(2);
		cycle.applyBrakes(1);
		
		System.out.println("Bicycle present State : ");
		cycle.printStates();
		
		Bike bike = new Bike(); 
		bike.speedUp(4);
		bike.changeGear(1);
		bike.applyBrakes(3);
		
		System.out.println("Bike present State : ");
		cycle.printStates();
		
	}
}
