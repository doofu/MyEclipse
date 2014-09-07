package partten.factoryMethod.fruitGardener;


public class StrawberryGardener implements FruitGardener {
	public Fruit factory() {
		return new Strawberry();
	}
}