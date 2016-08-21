package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StudentLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/swati/itu/geckodriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		
		driver.manage().window().maximize();
		
		//Incorrect email id format
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.name("user-email")).sendKeys("bangswati527@gmail.com");
		driver.findElement(By.name("user-pw")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);

		//correct id and incorrect pwd
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.name("user-email")).sendKeys("bangswati527@students.itu.edu");
		driver.findElement(By.name("user-pw")).sendKeys("99999999");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);

		//Incorrect id and correct pwd
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.name("user-email")).sendKeys("bangswati9999@students.itu.edu");
		driver.findElement(By.name("user-pw")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		//Incorrect id and incorrect pwd
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.name("user-email")).sendKeys("bangswati9999@students.itu.edu");
		driver.findElement(By.name("user-pw")).sendKeys("9999999");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);
		
		//ExistingID or new id
		driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
		driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.name("user-email")).sendKeys("bangswati527@students.itu.edu");
		driver.findElement(By.name("user-pw")).sendKeys("Sb@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[3]/input")).click();
		Thread.sleep(5000);

		
		
		//driver.findElement(By.xpath("html/body/section/div/div/div[2]/div/a[1]")).click();
				//Thread.sleep(5000);
				//driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");
				
				//INCORRECT EMAIL ID
				
				//driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[1]/a")).click();
				//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/label")).click();
				//driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]/a")).click();
		//driver.findElement(By.id("user-pw-repeat")).sendKeys("Sb@12345");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div[2]/form/div[3]/input")).click();
		//Thread.sleep(5000);
		
		//driver.get("http://localhost:8080/linkedus/student/stu-login-signup.html");

		
	}

}
