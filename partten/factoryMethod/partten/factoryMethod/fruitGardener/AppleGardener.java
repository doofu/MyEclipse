package partten.factoryMethod.fruitGardener;


public class AppleGardener implements FruitGardener {
	public Fruit factory() {
		return new Apple();
	}
}