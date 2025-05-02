package websitePages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class InputPage {
		 WebDriver driver;

		    public InputPage(WebDriver driver) {
		        this.driver = driver;
		    }

		    By inputBox = By.id("inputString");      // Assumed ID
		    By submitButton = By.id("submitBtn");    // Assumed ID

		    public void enterString(String input) {
		        driver.findElement(inputBox).sendKeys(input);
		    }

		    public void clickSubmit() {
		        driver.findElement(submitButton).click();
		    }
		}



