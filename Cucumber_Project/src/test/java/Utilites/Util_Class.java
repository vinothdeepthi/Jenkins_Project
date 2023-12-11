package Utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Constenes.constent;
import StepDefention.AddToCart;

public class Util_Class extends constent  {
	
	private static final Logger log = (Logger) LogManager.getLogger(Util_Class.class);
	
	public void LounchBrowser() {
		
		switch (constent.Browser_Name.toLowerCase()) {
		case "chrome":
			try {
				
				log.info("Louching The Chrome Browser" );
				System.setProperty(constent.system,constent.Browser_Path);
				driver = new ChromeDriver();
				wait = new WebDriverWait(driver, 30);
			    driver.manage().window().maximize();
			    
			    log.info("User Given Wait StateMent ");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
			} catch (Exception e) {
				
				log.error(e.getMessage());
			}
			
			
			break;

		case  "firefox":
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
			driver = new FirefoxDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			break;
		}
	}
	
	
	
	public static void ReadProperties() throws IOException {
		
		
		     log.info("Read The Properties File ");
			FileInputStream file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Cucumber_Project\\Properties\\Config.properties");
			
			Properties pro = new Properties();
			
			pro.load(file);
			
			log.info("Get The Data Form Properties File ");
			constent.Url=  pro.getProperty("url");
			constent.Browser_Name = pro.getProperty("browser");
			constent.Browser_Path=   pro.getProperty("browserPath");
			constent.Accountlogo=  pro.getProperty("AccountLogo");
			
			
	}
		
	/*public void GetProperties() throws IOException {
		
		log.info("Get The Data Form Properties File ");
		constent.Url=  ReadProperties().getProperty("url");
		constent.Browser_Name = ReadProperties().getProperty("browser");
		constent.Browser_Path=   ReadProperties().getProperty("browserPath");
		constent.Accountlogo=  ReadProperties().getProperty("AccountLogo");
	}*/
		
	
	

}
