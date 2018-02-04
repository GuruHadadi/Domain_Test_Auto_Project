package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy(linkText = "Domain")
    public WebElement domainLink;

    //  ----- Tabs -----
    @FindBy(css = "ul[class^=desktop-nav] a[class$=is-selected]")
    public WebElement topSelectedTab;

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
    public WebElement agentsLink;

    @FindBy(linkText = "News")
    public WebElement newsLink;

    @FindBy(linkText = "Advice")
    public WebElement adviceLink;

    @FindBy(linkText = "Living")
    public WebElement livingLink;

    //  ----- Section Headings -----
    @FindBy(css = "header[class^=domain-home] h1")
    public WebElement sectionHeadingz;

    @FindBy(css = "div h1")
    public WebElement sectionHeading;

    @FindBy(css = "div h1[class^=homepage-tag-line]")
    public WebElement sectionHeadingCommercial;

    @FindBy(css = "div [class^=new-homes] h1")
    public WebElement sectionHeadingNewHomes;


    //  ----- Form Buttons -----
    @FindBy(css = "form button[class$=is-selected]")
    public WebElement formSelectedButton;

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

    public Map<String, WebElement> getAllTabElements(){
        Map<String, WebElement> map = new HashMap<String, WebElement>();
        map.put("Rent", rentLink);
        map.put("Buy", buyLink);
        map.put("New Homes", newHomesLink);
        map.put("Sold", soldLink);
        map.put("Commercial", commercialLink);
        map.put("News", newsLink);
        map.put("Agents", agentsLink);
        map.put("Advice", adviceLink);
        map.put("Living", livingLink);

        return map;
    }

    //  This is a mechanism to identify elements by text using javascript
    // not used but retaining just for reference.
    public void retrieveElementsByText(){
//        this.formRentButton = eh.getElementByText("div[class^=search-box] button", "Rent");
//        this.formBuyButton = eh.getElementByText("div[class^=search-box] button", "Buy");
//        this.formSoldButton = eh.getElementByText("div[class^=search-box] button", "Sold");
//        this.formNewHomesButton = eh.getElementByText("div[class^=search-box] button", "New Homes");
    }


}
