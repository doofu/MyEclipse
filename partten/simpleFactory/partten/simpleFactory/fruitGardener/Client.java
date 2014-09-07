package partten.simpleFactory.fruitGardener;


public class Client {
	static public void main(String [] argv) {
		try {
			Fruit fruit1 = FruitGardener.factory("apple");
			fruit1.plant();
			fruit1.grow();
			fruit1.harvest();
			fruit1.info();
			
			Fruit fruit2 = FruitGardener.factory("grape");
			fruit2.plant();
			fruit2.grow();
			fruit2.harvest();
			fruit2.info();
			
			Fruit fruit3 = FruitGardener.factory("strawberry");
			fruit3.plant();
			fruit3.grow();
			fruit3.harvest();
			fruit3.info();
			
			FruitGardener.factory("orange");	
		} catch (BadFruitException e) {
			System.out.println(e.getMessage());
		}
	}
}