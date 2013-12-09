package com.exam;

public class Q140_Car implements Q140_Vehicle, Q140_Motorized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q140_Motorized motor= new Q140_Car();
		Q140_Vehicle vehicle = new Q140_Car();
		motor.stop();
		vehicle.stop();
	}

	@Override
	public void slow() {
		
	}

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		System.out.println("Car's stop is executing");
		
	}

}
