package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ejemplo_hardAssert {
  @Test
  public void asserEquals() {
	  int a=9;
	  int b=10;
	  Assert.assertEquals(a,b);
	  
  }
  @Test
  public void asserTrue() {
	  int a=9;
	  int b=10;
	  Assert.assertTrue(a==b);
	  
  }
  
  @Test
  public void verificarTitulo() {
	  String exePath="./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  //maximiza la ventana
		
		String actualTitulo=driver.getTitle();
		String esperadoTitulo="OrangeHRM2";
		Assert.assertEquals(actualTitulo,esperadoTitulo);

	  
	  
  }
  
  
}
