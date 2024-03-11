package afterLoginSkins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class WeightUpdate {
	AndroidDriver driver;

	public WeightUpdate(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void weightUpdateInlbs() {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "left",
			    "percent", 0.75
			));
		
	}
}
