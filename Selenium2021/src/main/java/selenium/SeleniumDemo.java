package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		String exePath="./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
		driver.get("https://www.cooltesters.com/tienda-de-cursos/selenium-con-java");
		//comentaio de axctualizacion a las 2:45  jajaja

	}

}
