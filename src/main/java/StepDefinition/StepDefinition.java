package StepDefinition;

import Utility.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class StepDefinition {

    private WebDriver driver;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() throws IOException {
        driver = Base.initializeDriver();
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @When("The user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[1]/div/span/input"));
        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/span/input"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/button"));
        loginButton.click();
        Thread.sleep(3000);
    }

    @Then("The user should be redirected to {string}")
    public void the_user_should_be_redirected_to(String expectedUrl) throws InterruptedException {
        expectedUrl = "https://staging.getfinti.com/app/dashboard";
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(expectedUrl) : "Expected URL: " + expectedUrl + " but got: " + actualUrl;
        Thread.sleep(3000);
    }
}