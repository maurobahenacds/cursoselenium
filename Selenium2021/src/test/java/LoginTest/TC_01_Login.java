package LoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NavigationPages.LoginPage;
import globalVariables.VariablesGlobales;
import setupDriver.DriverSetup;
 

public class TC_01_Login {
	//DEclarar e inicializar un objeto de tipo webdriver para usarlo en nuestro TestCase
	WebDriver driver=DriverSetup.setupDriver();
	//Crear para mis pruebas con assert 
	SoftAssert softassert = new SoftAssert();
	
	//Login Page Object
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
	}
			
	
	
  @Test
  public void TC_01() {
	  //login.Login("Admin", "admin123");
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PWD_ADMIN);
	    
	     //Yo y mis inventos de aqui estas lineas
	    String actualTitulo=driver.getTitle();
		String esperadoTitulo="OrangeHRM";
		String badTitulo="edfervcercercer";
		
		softassert.assertEquals(actualTitulo,badTitulo);
		softassert.assertEquals(actualTitulo,esperadoTitulo);
		softassert.assertAll();
  }
  
  
  
  
  @AfterTest
  public void closeDriver() {
	  driver.close();
  }
  
  
  
  
}
