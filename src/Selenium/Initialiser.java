package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialiser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		
		driver.get("https://www.instagram.com/");
	}

}
