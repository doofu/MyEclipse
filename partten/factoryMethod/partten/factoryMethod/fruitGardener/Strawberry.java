package partten.factoryMethod.fruitGardener;


public class Strawberry implements Fruit {
	public void plant() {
		log("Strawberry has been planted");
	}

	public void grow() {
		log("Strawberry is growing...");
	}

	public void harvest() {
		log("strawberry has been harvested");
	}
	
	private static void log(String msg) {
		System.out.println(msg);
	}

	public void info() {
		System.out.println("Strawberry tree.");
	}
}