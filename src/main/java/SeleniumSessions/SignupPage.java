package SeleniumSessions;

import org.openqa.selenium.By;

public class SignupPage {
	
	public SignupPage() {
		
		By signup= By.id("signup");
		
		System.out.println("This is signup constructor");
	}
	
	public void doSignUp(){
		System.out.println("This is local method");
	}
	
	public void signUpTest(){
		System.out.println("This is signup test method");
	}
		
			

}
