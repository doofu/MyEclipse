package partten.abstractFactory.Gardener;


import java.lang.String;

public class Client {
	private static TropicalGardener tropicalGardener;
	private static NorthernGardener northernGardener;
	private static Fruit fruit1;
	private static Fruit fruit2;
	private static Veggie veggie1;
	private static Veggie veggie2;

	static public void main(String[] argv) {
		tropicalGardener = new TropicalGardener();
		northernGardener = new NorthernGardener();
		
		fruit1 = tropicalGardener.createFruit("芒果");
		veggie1 = tropicalGardener.createVeggie("莲藕");
		fruit2 = northernGardener.createFruit("哈密瓜");
		veggie2 = northernGardener.createVeggie("大白菜");
		
		fruit1.info();
		veggie1.info();
		fruit2.info();
		veggie2.info();
	}
}