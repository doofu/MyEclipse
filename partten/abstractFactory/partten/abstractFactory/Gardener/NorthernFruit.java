package partten.abstractFactory.Gardener;


import java.lang.String;

public class NorthernFruit implements Fruit {
	private String name;

	public NorthernFruit(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("北方水果：" + this.name);
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}