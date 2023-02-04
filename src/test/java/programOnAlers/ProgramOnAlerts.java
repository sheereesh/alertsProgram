package programOnAlers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramOnAlerts {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(5000);
Alert	aalert=driver.switchTo().alert();
		

String text=aalert.getText();
System.out.println(text);
aalert.accept();

//before accept dismiss can be useddd;;
//aalert.dismiss();
driver.quit();
	}

}
