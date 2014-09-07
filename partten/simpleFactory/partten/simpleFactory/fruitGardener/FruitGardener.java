/**
 * 简单工厂模式
 */

package partten.simpleFactory.fruitGardener;

import java.lang.String;

public class FruitGardener {
	static public Fruit factory(String which) throws BadFruitException{
		if (which.equalsIgnoreCase("apple")) {
			return new Apple();
		}
		else if (which.equalsIgnoreCase("strawberry")) {
			return new Strawberry();
		}
		else if (which.equalsIgnoreCase("grape")) {
			return new Grape();
		}
		else {
			throw new BadFruitException("Bad fruit request: " + which);
		}
	}
}