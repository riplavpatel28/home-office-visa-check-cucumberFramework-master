package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class VisaConfirmationSteps  {

    @Given("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @When("I Select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I Select reason {string}")
    public void iSelectReason(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);

    }

    @And("I lick on Continue button")
    public void iLickOnContinueButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }

    @Then("I should see the text message {string}")
    public void iShouldSeeTheTextMessageYouWillNotNeedAVisaToComeToTheUK(String expectedResult) {
        Assert.assertEquals(new ResultPage().getResultMessage(), expectedResult);
    }

    @And("I select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);
    }

    @And("I select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String job) {
        new WorkTypePage().selectJobType(job);
    }

    @Then("I should see the text message  {string}")
    public void iShouldSeeTheTextMessage(String expectedResults) {
        Assert.assertEquals(new ResultPage().getResultTextMessage(),expectedResults);

    }

    @And("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String immigrationStatus) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(immigrationStatus);

    }

    @Then("I should able to see the text message {string}")
    public void iShouldAbleToSeeTheTextMessage(String expectedTextResult) {
        Assert.assertEquals(new ResultPage().getResultTextMessages(),expectedTextResult);

    }
}
