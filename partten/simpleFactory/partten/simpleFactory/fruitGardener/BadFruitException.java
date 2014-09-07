package partten.simpleFactory.fruitGardener;

import java.lang.String;
import java.lang.Exception;

public class BadFruitException extends Exception{
	private static final long serialVersionUID = 1L;

	public BadFruitException(String msg) {
		super(msg);
	}
}