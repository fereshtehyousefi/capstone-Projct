package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	
	@When ("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.AccountPage().AccountOption);
		logger.info("User click on Account option");
		
	}
	
	@And ("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name,String phone) {
		sendText(factory.AccountPage().name,name);
		sendText(factory.AccountPage().phone,phone);
		logger.info("User update Name and Phone");
		
	}
	
	@And ("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.AccountPage().UpdateButton);
		logger.info("User click on Update button");
		
	}
	
	@Then ("user profile information should be updated")
	public void userProfileInformationShouldBeUpdate() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().userNameInformation));
		logger.info("user profile information should be updated");
		
	}
	
	
	
	@And ("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String,String>>singUpData=data.asMaps(String.class,String.class);
		sendText(factory.AccountPage().previousPasswordInput,singUpData.get(0).get("previousPassword"));
		sendText(factory.AccountPage().newPasswordInput,singUpData.get(0).get("newPassword"));
		sendText(factory.AccountPage().confirmPasswordInput,singUpData.get(0).get("confirmPassword"));
		logger.info("User enter below information");
		
	}
	
	@Then ("a message should be displayed {string}")
	public void AMassageShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.AccountPage().PasswordUpdatedSuccessfully));
		logger.info("PasswordUpdatedSuccessfully");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
