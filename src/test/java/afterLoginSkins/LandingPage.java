package afterLoginSkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
     WebDriver driver;
     public  LoginPage loginPage;
    
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.TextView[@text='Already a member?  Login']")
	WebElement ele;
	public LoginPage loginMember() {
		ele.click();
		loginPage= new LoginPage(driver);
		return loginPage;
	}
}
