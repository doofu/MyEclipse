package partten.factoryMethod.fruitGardener;


public class GrapeGardener implements FruitGardener {
	public Fruit factory() {
		return new Grape();
	}
}