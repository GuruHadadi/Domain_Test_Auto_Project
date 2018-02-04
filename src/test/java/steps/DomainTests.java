package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import pages.DomainHomePage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by guru on 3/02/18.
 */
public class DomainTests {

    //  required basic variables
    static WebDriver driver;
    String baseUrl = "https://www.domain.com.au/";
    static Wait<WebDriver> wait;
    String browser = System.getProperty("browser");
    static Boolean oneTimeFlag = true;

    //  this is my browser stack credentials :)
    private static final String USERNAME = "guruhadadi1";
    private static  final String AUTOMATE_KEY = "CREdthD9fPLQZUp11qyr";
    private static  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    //  Pages
    DomainHomePage domainHome;

    @cucumber.api.java.Before
    public void setup() throws MalformedURLException {
        oneTimeSetup();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        //
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                afterAll();
            }
        }));

    }

    public void oneTimeSetup() throws MalformedURLException {
        if(oneTimeFlag) {
            if (browser.equals("firefox")) {
                System.out.println("Running test in local firefox");
                driver = new FirefoxDriver();
            } else if (browser.equals("chrome")) {
                System.out.println("Running test in local chrome");
                System.setProperty("webdriver.chrome.driver", "/Users/guru/Documents/Projects/TestAutomation/Sel_Java_Cuc/src/test/resources/chromedriver");
                driver = new ChromeDriver();
            } else if (browser.equals("cloud_firefox")) {
                System.out.println("Running test in cloud - browserstack - firefox");
                driver = new RemoteWebDriver(new URL(URL), DesiredCapabilities.firefox());
            } else {
                //  default
                driver = new FirefoxDriver();
            }
            driver.get(baseUrl);
            oneTimeFlag = false;
        }
    }

    @cucumber.api.java.After
    public void cleanup() {
        //driver.close();
    }

    public void afterAll() {
        try {
            if (driver != null)
                driver.quit();
        }catch (Exception e){
            //  TODO:
        }
    }

    @Given("^I am on Domain home page$")
    public void iAmOnDomainHomePage() throws Throwable {
        domainHome = new DomainHomePage(driver);
        //Assert.assertTrue(driver.getTitle().contains("Real Estate | Properties for Sale, Rent and Share | Domain"));
    }

    @When("^I click on the tab (.*?)$")
    public void iClickOnTheTabTabname(String tabName) throws Throwable {
        Map<String, WebElement> elements = domainHome.getAllTabElements();
        if(tabName.contains(" > ")){
            elements.get(tabName.split(" > ")[0]).click();
            elements.get(tabName.split(" > ")[1]).click();
        }else {
            elements.get(tabName).click();
        }
    }

    @Then("^the target tab-page (.*?) and section title (.*?) and (.*?) is displayed successfully$")
    public void theTargetTabPageTabNameAndSectionTitleSectionTitleIsDisplayedSuccessfully(String tabName, String sectionTitle, String pageTitle) throws Throwable {

        if (tabName.equals("New Homes") | tabName.equals("Agents") | tabName.contains("News")){
            Assert.assertTrue(domainHome.sectionHeading.getText().equals(sectionTitle));
            Assert.assertTrue(driver.getTitle().contains(pageTitle));
        }
        if (tabName.equals("Rent") | tabName.equals("Buy") | tabName.equals("Sold")){
            Assert.assertTrue(driver.getTitle().contains(pageTitle));
            Assert.assertTrue(domainHome.topSelectedTab.getText().equals(tabName));
            Assert.assertTrue(domainHome.formSelectedButton.getText().equals(tabName));
            Assert.assertTrue(domainHome.sectionHeading.getText().equals(sectionTitle));
        }
        if(tabName.equals("Commercial")){
            Assert.assertTrue(driver.getTitle().contains(pageTitle));
            Assert.assertTrue(domainHome.sectionHeading.getText().equals(sectionTitle));
            domainHome.domainLink.click();// come back to domain page
        }

    }

}
