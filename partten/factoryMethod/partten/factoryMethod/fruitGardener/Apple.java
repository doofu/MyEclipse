package partten.factoryMethod.fruitGardener;


public class Apple implements Fruit {
	private int treeAge;

	public void plant() {
		log("Apple has been planted");
	}

	public void grow() {
		log("Apple is growing...");
	}

	public void harvest() {
		log("Apple has been harvested");
	}
	
	private static void log(String msg) {
		System.out.println(msg);
	}
	
	public int getTreeAge() {
		return treeAge;
	}
	
	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

	public void info() {
		System.out.println("Apple tree. Tree's age is " + this.treeAge + " years old.");
	}
}