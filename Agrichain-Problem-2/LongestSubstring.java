package websiteTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import websitePages.InputPage;
import websitePages.ResultPage;

public class LongestSubstring extends BaseTest {

    @Test
    public void testValidSubstringResult() {
        InputPage home = new InputPage(driver);
        home.enterString("aaaaaa");
        home.clickSubmit();

        ResultPage result = new ResultPage(driver);
        String actual = result.getResult();

        Assert.assertEquals(actual, "a");
    }
}

