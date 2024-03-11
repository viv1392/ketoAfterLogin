package afterLoginSkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
     public WaterUpdate waterUpdate;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//android.widget.EditText[@text='Email Id']")
	WebElement emailBox;
	@FindBy(xpath="//android.widget.EditText[@text='Password']")
	WebElement passBox;
	@FindBy(xpath="//android.widget.TextView[@text='Login']")
	WebElement login;
	
	public WaterUpdate login(String mail,String pass) {
		emailBox.sendKeys(mail);
		passBox.sendKeys(pass);
		login.click();
		waterUpdate=new WaterUpdate(driver);
		return waterUpdate;
	}
}
