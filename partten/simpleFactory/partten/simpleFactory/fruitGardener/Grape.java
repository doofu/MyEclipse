package partten.simpleFactory.fruitGardener;

import java.lang.String;

public class Grape implements Fruit {
	private boolean seedless;

	public void plant() {
		log("Grape has been planted");
	}

	public void grow() {
		log("Grape is growing...");
	}

	public void harvest() {
		log("Grape has been harvested");
	}
	
	private static void log(String msg) {
		System.out.println(msg);
	}
	
	public boolean getSeedless() {
		return seedless;
	}
	
	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

	public void info() {
		System.out.println("Grape tree. Tree's seedless is " + this.seedless);
	}
}