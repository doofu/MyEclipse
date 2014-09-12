package partten.singleton.regSingleton;

import partten.singleton.regSingleton.*;

public class Client {
	static public void main(String [] argv) {
		RegSingleton regSingleton1;
		
		regSingleton1 = RegSingleton.getInstance(null);
		System.out.println(regSingleton1.about());
		
		RegSingletonChild regSingletonChild1;
		regSingletonChild1 = RegSingletonChild.getInstance();
		System.out.println(regSingletonChild1.about());
	}
}