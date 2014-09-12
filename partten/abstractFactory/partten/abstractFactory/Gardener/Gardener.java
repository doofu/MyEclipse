package partten.abstractFactory.Gardener;


import java.lang.String;

public interface Gardener {
	public Fruit createFruit(String name);

	public Veggie createVeggie(String name);
}