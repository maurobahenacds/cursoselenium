package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasboardPage {
	
	public DasboardPage(WebDriver driver) {
	PageFactory.initElements(driver, this);//Inicializando los pagesObjects con PAgeFactory, es un keyword de java donde
	//indicamos que en esta misma clase vamos a inicializar los metodos

}
	//WebElements
	@FindBy(id="welcome")  private WebElement welcomeDropDwn;
	@FindBy(xpath ="//*[@id=\"welcome-menu\"]/ul/li[3]/a") 	private WebElement logout;
	
	public void logout() {
		welcomeDropDwn.click();
		logout.click();
	}
 

}
