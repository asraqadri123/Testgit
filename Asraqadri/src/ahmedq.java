import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ahmedq {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.faceboook.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("asraqadri1@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		//Click on back button
		driver.navigate().back();
		//driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("asra");
		//driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("qadri");
		//driver.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys("972-955-7848");
		//driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("marium05");
		
			
		}

	}


