package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.ResourceService.WelcomeFactory;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
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
		
		//Obtener el titulo de la página
		String title=driver.getTitle();
		System.out.println(title);
				
		//validacion de la URL
		String urlActual=driver.getCurrentUrl();
		System.out.println("La URL actual es: " +urlActual);
		
		//Metodos de navegación
		//driver.navigate().back();
		//Thread.sleep(2000);
        //driver.navigate().forward();
        //Thread.sleep(2000);
        //driver.navigate().refresh();
		
		WebElement assignLeaveBtn=driver.findElement(By.className("quickLinkText"));
        assignLeaveBtn.click();
        
        WebElement employeeNameText=driver.findElement(By.id("assignleave_txtEmployee_empName"));
        employeeNameText.sendKeys("Mauro Bahena");
        Thread.sleep(1000);
        employeeNameText.clear();
        
        //verificar si un elemento esta desplegado
        WebElement assingBtn=driver.findElement(By.id("assignBtn"));
        boolean isDisplayed =assingBtn.isDisplayed();
        if(isDisplayed) {
        	System.out.println("El boton esta desplegado!");
        }
        
        //Obtener texto de un elemento web
        WebElement welcomeMsg=driver.findElement(By.id("welcome"));
        String message=welcomeMsg.getText();
        //contains() verifica que un String contenga otro string y nos regresa un boolean
        if(message.contains("Sai")) {
        	System.out.println("El mensaje contiene el nombre de SAI");
        }else {
        	System.out.println("ERROR! El mensaje no contiene el nombre SAI");
        }
        
        
        /*
        
        //Ejercicio clic en directorio y busqueda con nombre Nathan Elliot
        //Ejercicio
        //1. log in en OrangeHR
        //2. Click en Menu Directory
        //3. Buscar por "Nathan"
        //4. Click Search
        //Verificar el nombre completo de la persona
        
        
        
        WebElement directorio=driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
        directorio.click();
        Thread.sleep(100);
        WebElement buscarEmpleado=driver.findElement(By.id("searchDirectory_emp_name_empName"));
        buscarEmpleado.click();
        buscarEmpleado.clear();
        Thread.sleep(100);
        buscarEmpleado.sendKeys("Peter");
        Thread.sleep(500);
        WebElement searchBtn=driver.findElement(By.id("searchBtn"));
        searchBtn.click();
        Thread.sleep(500);
        WebElement resultadoBuscar=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b"));
        String resultadoB=resultadoBuscar.getText();
        if(resultadoB.contains("Nathan")) {
        	System.out.println("Busqueda exitosa: Peter");
        }else {
        	System.out.println("ERROR! no hay conincidencias de:  Peter");
        }
        
        */
        
        //Seleccionar con DrowDownLEaveType 
        Select drowlevel=new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
        drowlevel.selectByVisibleText("US - Vacation");
        drowlevel.selectByIndex(1);
        
        //Metodos para cerrar un navegador Web
        //driver.close(); //cierra la ventana del webdriver
        //driver.quit(); //Cierra todas las ventanas
        
      
        

	}

}
