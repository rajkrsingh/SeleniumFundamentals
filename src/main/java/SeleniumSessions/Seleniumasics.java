package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj Kumar Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("Title of the page is:"+title);
		
		//Verification of the title
		if(title.equals("Google")){
			System.out.println("Title is correct");
		}
		
		else {
			System.out.println("Title is not correct");
		}
	}

}
