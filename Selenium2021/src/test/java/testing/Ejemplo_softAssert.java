package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_softAssert {
	
SoftAssert softassert = new SoftAssert();
  @Test
  public void softAssertEquals() {
	  int a=5;
	  int b=10;
	  int x=8;
	  int y=8;
	  
	  softassert.assertEquals(a, b);
	  softassert.assertEquals(x, y);
	  
	  softassert.assertAll();
	  
  }
  @Test
  public void softAssertEquals2() {
	  String exePath="./Driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  //maximiza la ventana
		
		String actualTitulo=driver.getTitle();
		String esperadoTitulo="OrangeHRM";
		String badTitulo="edfervcercercer";
		
		softassert.assertEquals(actualTitulo,badTitulo);
		softassert.assertEquals(actualTitulo,esperadoTitulo);
		softassert.assertAll();
	  

  }
  
  
}
