package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/swati/itu/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost:8080/linkedus/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/section/div/div/div[2]/div/a[1]")).click();
		Thread.sleep(5000);
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		
		//INCORRECT EMAIL ID
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("user-email")).sendKeys("bangswati527@gmail.com");
		driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		driver.findElement(By.id("user-pw-repeat")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");

		//INCORRECT REPEAT PASSWORD
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("user-email")).sendKeys("bangswati527@students.itu.edu");
		driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		driver.findElement(By.id("user-pw-repeat")).sendKeys("Sb@54321");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		
		//EXISTING ID
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("user-email")).sendKeys("bangswati527@students.itu.edu");
		driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		driver.findElement(By.id("user-pw-repeat")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		//NEW ID
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("user-email")).sendKeys("bangbangbang@students.itu.edu");
		driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		driver.findElement(By.id("user-pw-repeat")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/label")).click();
		//driver.findElement(By.xpath(".//*[@id='user-email']")).sendKeys("bangswati527@students.itu.edu");
		
		//driver.findElement(By.id("user-email")).sendKeys("bangswati527@students.itu.edu");
		//driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/label")).click();
		//driver.findElement(By.id("user-pw")).sendKeys("Sb@12345");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		//Thread.sleep(5000);

		
		//driver.findElement(By.xpath(".//*[@id='user-email']")).sendKeys("bangswati527@students.itu.edu");
		
		//driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		//sendKeys("bangswati527@students.itu.edu");
		//driver.findElement(By.xpath("").
		//driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		//System.out.printf("wait over %s",driver.getPageSource());
		
		//driver.findElement(By.cssSelector("#user-email")).click();

		//driver.findElement(By.id("user-email")).sendKeys("bangswati527@students.itu.edu");
		//System.out.println("first write done");

		//driver.findElement(By.xpath(".//*[@id='user-pw']")).sendKeys("Sb@12345");
		
	}

}
