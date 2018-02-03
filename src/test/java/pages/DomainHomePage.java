package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guru on 3/02/18.
 */
public class DomainHomePage extends PageObject{

    public WebElement element;
    public JavascriptExecutor js;
    public ElementsHelper eh;

    @FindBy(linkText = "Buy")
    public WebElement buyLink;

    @FindBy(linkText = "Rent")
    public WebElement rentLink;

    @FindBy(linkText = "New homes")
    public WebElement newHomesLink;

    @FindBy(linkText = "Sold")
    public WebElement soldLink;

    @FindBy(linkText = "Commercial")
    public WebElement commercialLink;

    @FindBy(linkText = "Agents")
    public WebElement agentslLink;

    @FindBy(css = "header[class^=domain-home] h1")
    public WebElement sectionHeading;

    @FindBy(css = "div h1[class^=homepage-tag-line]")
    public WebElement sectionHeadingCommercial;

    public WebElement formBuyButton;
    public WebElement formRentButton;
    public WebElement formNewHomesButton;
    public WebElement formSoldButton;

    public DomainHomePage(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
        eh = new ElementsHelper(driver, js);
        retrieveElementsByText();
    }

    public void retrieveElementsByText(){
//        this.rentButton = eh.getElementByText("div[class^=search-box] button", "Rent");
//        this.rentButton = eh.getElementByText("div[class^=search-box] button", "Rent");
//        this.rentButton = eh.getElementByText("div[class^=search-box] button", "Rent");
    }

    public Map<String, WebElement> getAllTabElements(){
        Map<String, WebElement> map = new HashMap<String, WebElement>();
        map.put("Rent", rentLink);
        map.put("Buy", buyLink);
        map.put("New Homes", newHomesLink);
        map.put("Sold", soldLink);

        return map;
    }

}
