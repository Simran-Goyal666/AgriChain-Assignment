package websitePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
	 WebDriver driver;

	    public ResultPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    By resultText = By.id("resultSubstring"); // Assumed locator

	    public String getResult() {
	        return driver.findElement(resultText).getText();
	    }
	}

