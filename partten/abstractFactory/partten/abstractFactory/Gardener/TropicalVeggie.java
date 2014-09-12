package partten.abstractFactory.Gardener;


import java.lang.String;

public class TropicalVeggie implements Veggie {
	private String name;

	public TropicalVeggie(String name) {
		this.name = name;
	}

	public void info() {
		System.out.println("热带蔬菜：" + this.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}