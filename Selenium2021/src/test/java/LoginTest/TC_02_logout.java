package LoginTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import NavigationPages.DasboardPage;
import NavigationPages.LoginPage;
import globalVariables.VariablesGlobales;
import setupDriver.DriverSetup;
 

public class TC_02_logout {
	//DEclarar e inicializar un objeto de tipo webdriver para usarlo en nuestro TestCase
	WebDriver driver=DriverSetup.setupDriver();
	

	//Login Page Object
	LoginPage login = new LoginPage(driver);
	DasboardPage dashboard=new DasboardPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(VariablesGlobales.HOME_PAGE);
	}
			
	
	
  @Test
  public void TC_01() {
	  //login.Login("Admin", "admin123");
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.PWD_ADMIN);
	  dashboard.logout();
 
  }
   
  
  @AfterTest
  public void closeDriver() {
	 // driver.close();
  }
  
  
  
  
}
