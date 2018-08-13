package egor.st.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;

/**
 * Created by estarcev on 13.08.2018.
 */
@DefaultUrl("https://translate.google.ru/#en/ru/")
public class TranslationPage extends PageObject {

    @FindBy(css = "textarea#source")
    private WebElementFacade textArea;

    @FindBy(css = "input#gt-submit")
    private WebElementFacade translateButton;

    public void enter_keywords(String keyword) {
        textArea.type(keyword);
    }

    public void lookup_translate() {
        translateButton.click();
    }

    public String getTranslate() {
        WebElementFacade result = find(By.cssSelector("span#result_box span"));
        if (result != null) {
            return result.getText();
        }
        return "";
    }
}
