package partten.abstractFactory.Gardener;


import java.lang.String;

public class NorthernGardener implements Gardener {
	public Fruit createFruit(String name) {
		return new NorthernFruit(name);
	}

	public Veggie createVeggie(String name) {
		return new NorthernVeggie(name);
	}
}