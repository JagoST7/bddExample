package egor.st.steps;

/**
 * Created by estarcev on 13.08.2018.
 */

import egor.st.steps.serenity.EndUserTranslationSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TranslationSteps {

    @Steps
    EndUserTranslationSteps endUser;

    @Given("the user is on the Translate home page")
    public void givenTheUserIsOnTheTranslateHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the translation of the word '$word'")
    public void whenTheUserLooksUpTheTranslationOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the translation '$definition'")
    public void thenTheyShouldSeeTheTranslation(String definition) {
        endUser.should_see_definition(definition);
    }

}
