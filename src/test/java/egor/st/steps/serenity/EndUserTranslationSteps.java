package egor.st.steps.serenity;

import egor.st.pages.TranslationPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by estarcev on 13.08.2018.
 */
public class EndUserTranslationSteps {
    TranslationPage page;

    @Step
    public void is_the_home_page() {
        page.open();
    }

    @Step
    public void looks_for(String term) {
        page.enter_keywords(term);
        page.lookup_translate();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(page.getTranslate().toLowerCase(), equalTo(definition.toLowerCase()));
    }
}
