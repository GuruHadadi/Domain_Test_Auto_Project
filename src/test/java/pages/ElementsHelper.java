package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by guru on 3/02/18.
 */
public class ElementsHelper {
    WebDriver driver;
    JavascriptExecutor js;

    ElementsHelper(WebDriver driver, JavascriptExecutor js){
        this.driver = driver;
        this.js = js;
    }
    /*
        - In native selenium webdirver, finding elements is not fully straight forward(apart from links)
        - we need to rely on javascript/jquery.
        - Below method basically accepts a selector which retrieves few elements in dom.
        - Second arg is the 'text'. Search will be made among the elements retrieved based on 1st arg selector
     */
    public WebElement getElementByText(String selector, String text) {
        WebElement e = (WebElement) (js.executeScript(
                "var elements = document.querySelectorAll('"+selector+"');\n" +
                        "  return Array.prototype.filter.call(elements, function(element){\n" +
                        "    return RegExp('"+text+"').test(element.textContent);\n" +
                        "  })[0];"
        ));
        return e;
    }








    // This function is not used but just kept it to reference later
    public WebElement getElementByText_NotUsed(String selector, String text) {
        WebElement e = (WebElement) (js.executeScript(
                "{var lst = document.querySelectorAll('"+selector+"');\n" +
                        "    var searchText = '" + text + "';\n" +
                        "    var found;\n" +
                        "\n" +
                        "    for (var i = 0; i < lst.length; i++) {\n" +
                        "      if (lst[i].textContent == searchText) {\n" +
                        "        found = lst[i];\n" +
                        "        return found;\n" +
                        "        break;\n" +
                        "      }\n" +
                        "    }}"
        ));
        return e;
    }
}
