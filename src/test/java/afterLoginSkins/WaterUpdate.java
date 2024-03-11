package afterLoginSkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class WaterUpdate {
     WebDriver driver;
	public WaterUpdate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//android.widget.TextView[@text='Water Intake Summary ›']")
	WebElement summary;
	@FindBy(xpath="(//android.widget.TextView[@text='Update water intake'])[2]")
	WebElement updateWater;
	@FindBy(xpath="//android.widget.TextView[@text='500ml']")
	WebElement waterQuantity;
	@FindBy(xpath="//android.widget.TextView[@text='Add record']")
	WebElement addRecord;
	
	public void Add500ml() throws InterruptedException {
		Thread.sleep(2000);
		summary.click();
		updateWater.click();
		waterQuantity.click();
		addRecord.click();
		driver.navigate().back();
		
	}
}
