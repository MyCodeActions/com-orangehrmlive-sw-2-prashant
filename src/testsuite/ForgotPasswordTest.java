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

        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals(expectedText, actualText);

        driver.findElement(By.xpath("//button[@type='button']")).click();
        String expectedTextForLogin = "Login";
        String actualTextForLogin = driver.findElement(By.xpath("//h5")).getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
