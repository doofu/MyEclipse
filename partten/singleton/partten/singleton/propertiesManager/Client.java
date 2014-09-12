package partten.singleton.propertiesManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	static public void main(String [] argv) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("请输入属性名， quit 退出：");
			String line = reader.readLine();
			
			if (line.equals("quit")) {
				break;
			}
			
			ConfigManager configManager = ConfigManager.getInstance();
			System.out.println(configManager.getConfigItem(line, "没有找到！"));
		} while (true);
	}
}