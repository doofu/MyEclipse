package partten.factoryMethod.fruitGardener;


public class Client {
	private static FruitGardener fruitGardener1;
	private static FruitGardener fruitGardener2;
	private static FruitGardener fruitGardener3;
	private static Fruit fruit1;
	private static Fruit fruit2;
	private static Fruit fruit3;

	static public void main(String [] argv) {
		fruitGardener1 = new AppleGardener();
		fruit1 = fruitGardener1.factory();
		fruit1.plant();
		fruit1.grow();
		fruit1.harvest();
		fruit1.info();
		
		fruitGardener2 = new StrawberryGardener();
		fruit2 = fruitGardener2.factory();
		fruit2.plant();
		fruit2.grow();
		fruit2.harvest();
		fruit2.info();
		
		fruitGardener3 = new GrapeGardener();
		fruit3 = fruitGardener3.factory();
		fruit3.plant();
		fruit3.grow();
		fruit3.harvest();
		fruit3.info();
	}
}