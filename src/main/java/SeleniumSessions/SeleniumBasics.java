package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj Kumar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Welcome to Selenium World...");
		driver.get("https://www.google.com");
		System.out.println("Launching google home page");
		
		
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		
		//Verification of the title
		if(title.equals("Google")){
			System.out.println("Title is correct");
		}
		
		else {
			System.out.println("Title is not correct....");
		}
	}

}
