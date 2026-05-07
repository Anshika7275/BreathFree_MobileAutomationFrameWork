package breathFreeLogin_OnboardingTest;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import BaseClass.baseClass;
import io.appium.java_client.AppiumBy;

public class Login_OnboardingTest extends baseClass {

	@Test
	public void selfOnboardingFlow() throws Throwable {

		// ============================================================
		// LOGIN SCREEN
		// ============================================================

		Thread.sleep(3000);

		try {

			driver.findElement(
					AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cancel\"]"))
					.click();

		} catch (Exception e) {

			System.out.println("Popup not displayed");
		}

		WebElement mobileNumber = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.widget.EditText")));

		mobileNumber.click();
		mobileNumber.clear();
		mobileNumber.sendKeys("9999999901");

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Continue\"]"))
				.click();

		System.out.println("Mobile number entered successfully");

		// ============================================================
		// OTP SCREEN
		// ============================================================

		Thread.sleep(2000);

		List<WebElement> otpField = driver.findElements(
				AppiumBy.xpath("//android.widget.EditText"));

		if (otpField.size() == 1) {

			otpField.get(0).click();
			otpField.get(0).sendKeys("1122");
		}

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Verify\"]"))
				.click();

		System.out.println("OTP verified successfully");

		// ============================================================
		// LANGUAGE SCREEN
		// ============================================================

		WebElement englishLanguage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"English, English\"]")));

		clickElement(englishLanguage);

		WebElement nextCTA = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]")));

		clickElement(nextCTA);

		System.out.println("Language selected successfully");

		// ============================================================
		// WHO ARE YOU USING THIS APP FOR
		// ============================================================

		WebElement myself = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Myself\"]")));

		clickElement(myself);

		System.out.println("Myself option selected");

		// ============================================================
		// PERSONAL DETAILS SCREEN
		// ============================================================

		Thread.sleep(2000);

		driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@text=\"Eg. Meera Kumar\"]"))
				.sendKeys("Automation User");

		System.out.println("Name entered");

		// ============================================================
		// GENDER SELECTION
		// ============================================================

		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup"))
				.click();

		System.out.println("Gender selected");

		// ============================================================
		// DOB ENTRY
		// ============================================================

		WebElement DD = driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@text=\"DD\"]"));

		DD.click();
		DD.sendKeys("11");

		WebElement MM = driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@text=\"MM\"]"));

		MM.click();
		MM.sendKeys("12");

		WebElement YYYY = driver.findElement(
				AppiumBy.xpath("//android.widget.EditText[@text=\"YYYY\"]"));

		YYYY.click();
		YYYY.sendKeys("2000");

		driver.hideKeyboard();

		System.out.println("DOB entered");

		// ============================================================
		// SCROLL DOWN
		// ============================================================

		driver.findElement(
				AppiumBy.androidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		// ============================================================
		// HEIGHT & WEIGHT
		// ============================================================

		List<WebElement> heightWeightFields = driver.findElements(
				AppiumBy.xpath("//android.widget.EditText[@text=\"0\"]"));

		heightWeightFields.get(0).click();
		heightWeightFields.get(0).sendKeys("5");

		heightWeightFields.get(1).click();
		heightWeightFields.get(1).sendKeys("5");

		heightWeightFields.get(2).click();
		heightWeightFields.get(2).sendKeys("50");

		driver.hideKeyboard();

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))
				.click();

		System.out.println("Personal details entered successfully");

		// ============================================================
		// COHORT SCREEN
		// ============================================================

		WebElement asthma = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.widget.TextView[@text=\"Asthma\"]")));

		clickElement(asthma);

		driver.findElement(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"))
				.click();

		System.out.println("Cohort selected successfully");

		// ============================================================
		// DURATION SCREEN
		// ============================================================

		Thread.sleep(1000);

		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"))
				.click();

		System.out.println("Duration selected");

		// ============================================================
		// SYMPTOMS SCREEN
		// ============================================================

		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"))
				.click();

		WebElement symptomNext = driver.findElement(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"));

		clickElement(symptomNext);

		System.out.println("Symptoms selected successfully");

		// ============================================================
		// CONDITIONS SCREEN
		// ============================================================

		driver.findElement(
				AppiumBy.androidUIAutomator(
						"new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Any Cardiac Issue\"]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"None of the above\"]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Next\"]"))
				.click();

		System.out.println("Conditions selected successfully");

		// ============================================================
		// INHALER TYPE SCREEN
		// ============================================================

		Thread.sleep(2000);

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"MDI\"]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))
				.click();

		System.out.println("Inhaler type selected");

		// ============================================================
		// INHALER BRAND SCREEN
		// ============================================================

		Thread.sleep(2000);

		driver.findElement(
				AppiumBy.xpath("(//android.view.ViewGroup)[20]"))
				.click();

		driver.findElement(
				AppiumBy.xpath("//android.widget.TextView[@text=\"Next\"]"))
				.click();

		System.out.println("Inhaler selected successfully");

		// ============================================================
		// REMINDER SCREEN
		// ============================================================

		Thread.sleep(2000);

		WebElement saveReminder = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.widget.TextView[@text=\"Save Reminder\"]")));

		clickElement(saveReminder);

		System.out.println("Reminder saved successfully");

		// ============================================================
		// SUCCESS SCREEN
		// ============================================================

		Thread.sleep(3000);

		WebElement continueCTA = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
						AppiumBy.xpath("//android.view.View")));

		clickElement(continueCTA);

		System.out.println("Self onboarding completed successfully");
	}

	// ============================================================
	// COMMON CLICK METHOD
	// ============================================================

	public void clickElement(WebElement element) {

		try {

			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();

		} catch (Exception e) {

			((JavascriptExecutor) driver).executeScript(
					"mobile: clickGesture",
					Map.of(
							"elementId",
							((RemoteWebElement) element).getId()));
		}
	}
}