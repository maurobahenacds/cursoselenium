package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String exePath="./Driver/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.manage().window().maximize();  //maximiza la ventana
				// aqui colocamos una pausa con implicit wait
			
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Se puede modificar el nombre del ID del elemento: txtUsernam para visualizar el ejemplo
				//corremos primero sin el implicit y el error sale de inmediato
				//si corremos con el implicit el error sale hasta 10 segundos despues
				WebElement username=driver.findElement(By.id("txtUsername"));
			 
	}

}
