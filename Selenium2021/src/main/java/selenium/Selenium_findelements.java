package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath="./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();  //maximiza la ventana
		WebElement username=driver.findElement(By.id("txtUsername"));
		WebElement userPassword=driver.findElement(By.id("txtPassword"));
		WebElement btnLogin=driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		Thread.sleep(500);
		userPassword.sendKeys("admin123");
		Thread.sleep(500);
		btnLogin.click();
		
		
		List <WebElement> firsLevelMenu = driver.findElements(By.xpath("//*[@class=\"firstLevelMenu\"]/b"));
		//Cono sacar el Xpath seria con seleccionar un elemento del menu Admin por ejejmplo y copiar su codigo xpath
		//luego con buscar en el codigo Ctrl-F pegar y editamos ahi-->>  //*[@id="menu_admin_viewAdminModule"]/b
		//Colocamos el class firstLevelMenu que es donde viene el elemento y despues ya se copia como xpath
		
		//List <WebElement> firsLevelMenu = driver.findElements(By.className("firstLevelMenu"));
		
		System.out.println("Numero de elementos: " + firsLevelMenu.size());
		String primerMenu=firsLevelMenu.get(0).getText();
		System.out.println(primerMenu);
		for (int i = 0; i < firsLevelMenu.size(); i++) {
			System.out.println("Los menus son: " +firsLevelMenu.get(i).getText());
		}
		
		
		

	}

}
