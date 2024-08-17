package StepDefinition;

import Utility.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddMerchantStepDefinition {


    private WebDriver driver;

    @Given("The user is on the merchant addition page")
    public void the_user_is_on_the_merchant_addition_page() {
        this.driver = Base.getDriver();
        driver.findElement(By.xpath("/html/body/div/div/header/div[2]/div[2]/div/button[1]")).click();
    }

    @When("The user fills out business page with the following details")
    public void the_user_fills_out_business_page_with_the_following_details() throws InterruptedException {
        driver.findElement(By.name("legalBusinessName")).sendKeys("SMerchants");
        driver.findElement(By.name("dbaName")).sendKeys("Test");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[3]/div/div/div/div/span[2]"))));
        dropdownButton.click();
        WebElement optionToSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[5]/div")));
        optionToSelect.click();

        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[5]/div/div/input")).sendKeys("312389123");

        WebElement dropdownButtonThree = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[6]/div/div/div/div/span[2]"))));
        dropdownButtonThree.click();
        Thread.sleep(1000);
        WebElement options = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div")));
        options.click();

        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div/div[7]/div/div/input")).sendKeys("XYZ");
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[8]/div/div/input")).sendKeys("Chicago");

        WebElement dropdownButtonFour = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[9]/div/div/div/div/span[2]"))));
        dropdownButtonFour.click();
        Thread.sleep(1000);
        WebElement listoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div/div/div/div[2]/div")));
        listoption.click();

        driver.findElement(By.name("zipcode")).sendKeys("765456");

        WebElement dropdownButtonFive = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[11]/div/div/div/div/span[2]"))));
        dropdownButtonFive.click();
        Thread.sleep(1000);
        WebElement listoptions = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div[3]/div")));
        listoptions.click();

        WebElement dropdownButtonTwo = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[4]/div/div/div/div/span[2]"))));
        dropdownButtonTwo.click();
        Thread.sleep(1000);
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div/div/div/div/div/div/div[1]/div")));
        option.click();

        driver.findElement(By.name("firstName")).sendKeys("Lejff");
        driver.findElement(By.name("lastName")).sendKeys("vids");
        driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-0\"]/div/div[2]/div/div[3]/div/div/input")).sendKeys("9800588323");
        driver.findElement(By.name("email")).sendKeys("hklhhk@gmail.com");

        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div/div/input[1]")).sendKeys("12");
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div/div/input[2]")).sendKeys("12");
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[2]/div/div[5]/div/div/input[3]")).sendKeys("2000");

        driver.findElement(By.name("ssn")).sendKeys("3214");
        driver.findElement(By.name("username")).sendKeys("olklp");
        driver.findElement(By.name("password")).sendKeys("User@123");
    }

    @Then("User clicks on save and continue")
    public void user_clicks_on_save_and_continue() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[1]/div/div[4]/button[2]/div")).click();
        Thread.sleep(1000);
    }

    @Given("The user is on the banking page")
    public void the_user_is_on_the_banking_page() {
        this.driver = Base.getDriver();
        String bankingpageurl = driver.getCurrentUrl();
        System.out.println(bankingpageurl);
    }

    @When("The user fills out banking page with the following details")
    public void the_user_fills_out_banking_page_with_the_following_details() throws InterruptedException {
        driver.findElement(By.name("name")).sendKeys("ABCD BANK");
        driver.findElement(By.name("address1")).sendKeys("New Jersey");
        driver.findElement(By.name("city")).sendKeys("Chicago");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newbutton = wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div/div/div[1]/div/div[4]/div/div/div/div/span[2]"))));
        newbutton.click();
        Thread.sleep(1000);
        WebElement newoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[3]/div")));
        newoption.click();

        driver.findElement(By.name("zipcode")).sendKeys("765678");
        driver.findElement(By.name("phone")).sendKeys("210-312-3123");
        driver.findElement(By.name("nameOnAccount")).sendKeys("lvid");
        driver.findElement(By.name("accountNumber")).sendKeys("907217887035");
        driver.findElement(By.name("routingNumber")).sendKeys("128312331");
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div/button[2]")).click();
    }

    @Given("The user is on the insights page")
    public void the_user_is_on_the_insights_page() {
        this.driver = Base.getDriver();
        String insightspageurl = driver.getCurrentUrl();
        System.out.println(insightspageurl);
    }

    @When("The user fills out insights page with the following details")
    public void the_user_fills_out_insights_page_with_the_following_details() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[3]/div/div[2]/div/button[2]")).click();
    }

    @Given("The user is on the agreement page")
    public void the_user_is_on_the_agreement_page() {
        this.driver = Base.getDriver();
        String agreementURL = driver.getCurrentUrl();
        System.out.println(agreementURL);
    }

    @When("The user fills out agreement page with the following details")
    public void the_user_fills_out_agreement_page_with_the_following_details() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[3]/div/div[2]/div/label[3]/span[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[4]/div/div[3]/div/button[2]")).click();
    }

    @Given("The user is on the payment page")
    public void the_user_is_on_the_payment_page() {
        this.driver = Base.getDriver();
        String payemntpage = driver.getCurrentUrl();
        System.out.println(payemntpage);
    }

    @When("The user fills out payment page with the following details")
    public void the_user_fills_out_payment_page_with_the_following_details() throws InterruptedException {
        driver.findElement(By.name("cardnumber")).sendKeys("000000000000");
        driver.findElement(By.name("cvc")).sendKeys("900");
        driver.findElement(By.name("exp-date")).sendKeys("1227");

        driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div[2]/div/div[5]/div/div[2]/label/span/input")).click();

    }

}