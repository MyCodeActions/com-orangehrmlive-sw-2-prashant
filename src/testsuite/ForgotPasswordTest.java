package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test in the ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully()
 *  click on the ‘Forgot your password’ link
 *  Verify the text ‘Reset Password’
 *  click on the ‘Cancel’ button
 *  Verify the text ‘Login’
 */

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();

        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/h6")).getText();
        Assert.assertEquals(expectedText, actualText);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]")).click();
        String expectedTextForLogin = "Login";
        String actualTextForLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
