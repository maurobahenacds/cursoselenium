package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String exePath="./Driver/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.manage().window().maximize();  //maximiza la ventana
				// aqui colocamos una pausa con Explicit wait
				//ES un tiempo y contidiones especiticas para un elemento,
				//por ejemplo modificamos el nombre del id txtUsername a txtUsernam entonces tardará 10 segundos en localizar el
				//elemento y nos mandará el error.
				WebElement userName=new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("txtUsernam")));

	}

}
