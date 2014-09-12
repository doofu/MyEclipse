package partten.abstractFactory.Gardener;


import java.lang.String;

public class TropicalFruit implements Fruit {
	private String name;

	public TropicalFruit(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("热带水果：" + this.name);
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}