package partten.abstractFactory.Gardener;


import java.lang.String;

public class NorthernVeggie implements Veggie {
	private String name;

	public NorthernVeggie(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("北方蔬菜：" + this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}