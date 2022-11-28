package com.projectname.e2e.tests.pages;


import com.projectname.e2e.tests.data.model.UpdateUserRequest;
import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.pages.navigation.bar.NavigationBarPage;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class UpdateUserPage extends PageBase {
    public UpdateUserPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
            if(!isDisplayed()){
                NavigationBarPage navigationBarPage = new NavigationBarPage(driver,url,email,password);
                navigationBarPage.openUpdateUserPage();
            }
            //otvaranje novog prozora
            ArrayList<String> tabs= new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            return this;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.xpath("//*[@id=\"main-body\"]/div/div[1]/div[1]/div[1]/div/div[1]"),driver);
    }


    private WebElement getFirstName() {
        try {
            return driver.findElement(CustomBy.id("inputFirstName"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find employee first name on update User page", e);
        }
    }
    private WebElement getLastName() {
        try {
            return driver.findElement(CustomBy.id("inputLastName"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find employee last  name on update User page", e);
        }
    }
    private WebElement getCompany() {
        try {
            return driver.findElement(CustomBy.id("inputCompanyName"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find company on update User page", e);
        }
    }
    private WebElement getEmailField() {
        try {
            return driver.findElement(CustomBy.id("inputEmail"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find email field on Signup page", e);
        }
    }
    private WebElement getStreetAddressField() {
        try {
            return driver.findElement(CustomBy.id("inputAddress1"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address field on Signup page", e);
        }
    }
    private WebElement getStreetAddress2Field() {
        try {
            return driver.findElement(CustomBy.id("inputAddress2"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address 2 field on Signup page", e);
        }
    }
    private WebElement getCityField() {
        try {
            return driver.findElement(CustomBy.id("inputCity"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address 2 field on Signup page", e);
        }
    }
    private WebElement getStateField() {
        try {
            return driver.findElement(CustomBy.id("stateinput"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address 2 field on Signup page", e);
        }
    }
    private WebElement getPostcodeField() {
        try {
            return driver.findElement(CustomBy.id("inputPostcode"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address 2 field on Signup page", e);
        }
    }
    private WebElement getCountryField() {
        try {
            return driver.findElement(CustomBy.id("inputCountry"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find country field on Signup page", e);
        }
    }
    private void selectCountry(String country) {
        Select countries = new Select(getCountryField());
        countries.selectByValue(country);
    }
    private WebElement getCountryNumberButton() {
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/div/div[2]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find country number button field on Signup page", e);
        }
    }
    private List<WebElement> getCountriesListNumberButton() {
        try {
            return driver.findElements(CustomBy.className("country-name"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find countries list on Signup page", e);
        }
    }

    private WebElement getCountryFromTheListOfCountries(String country) {
        getCountryNumberButton().click();
        List<WebElement> countries = getCountriesListNumberButton();
        for(WebElement countryElement : countries) {
            if (countryElement.getText().equals(country)) {
                return countryElement;
            }
        }
        throw new AssertionError("Could not find country in the list of countries on Signup page");
    }

    private WebElement getInputPhoneField() {
        try {
            return driver.findElement(CustomBy.id("inputPhone"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find street address field on Signup page", e);
        }
    }
    private WebElement getInputPaymentMethodField() {
        try {
            return driver.findElement(CustomBy.id("inputPaymentMethod"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find payment method field on Signup page", e);
        }
    }

    private List<WebElement> getPaymentMethodeFromTheListOfPayments() {
        try {
            return driver.findElements(CustomBy.className("from-group"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find payment methode list on Signup page", e);
        }
    }

    private WebElement getPaymentMethodeFromTheListOfPayments(String paymentMethode) {
        getPaymentMethodeButton().click();
        List<WebElement> paymentMethodes = (List<WebElement>) getPaymentMethodeButton();
        for(WebElement paymentMethodeElement : paymentMethodes) {
            if (paymentMethodeElement.getText().equals(paymentMethode)) {
                return paymentMethodeElement;
            }
        }
        throw new AssertionError("Could not find country in the list of countries on Signup page");
    }

    private void selectPaymentMethode(String paymentMethode) {
        Select paymentMethodes = new Select(getInputPaymentMethodField());
        paymentMethodes.selectByValue(paymentMethode);
    }
    private WebElement getPaymentMethodeButton() {
        try {
            return driver.findElement(CustomBy.id("inputPaymentMethod"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find payment methode button field on Signup page", e);
        }
    }

    private WebElement getInputBillingContactField() {
        try {
            return driver.findElement(CustomBy.id("inputBillingContact"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Billing contact field on Signup page", e);
        }
    }

    private WebElement getMobileField() {
        try {
            return driver.findElement(CustomBy.id("customfield2"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find not a mobile field on Signup page", e);
        }
    }

    private WebElement getGeneralEmailsCheckbox() {
        try {
            return driver.findElement(CustomBy.id("generalEmails"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find general email checkbox on Account Update Page", e);
        }
    }

    private WebElement getClientAreaButton() {
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"main-body\"]/div/div[1]/div[1]/div[1]/div/div[3]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find client area button on Account Update Page");
        }
    }

    public UpdateUserPage openUpdateUserPage() {
        getClientAreaButton().click();
        return new UpdateUserPage(driver, url, email, password);
    }

    private WebElement getSaveButton() {
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"main-body\"]/div/div[1]/div[2]/form/div[4]/input[1]"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find save button on Signup page", e);
        }
    }

    public UpdateUserPage updateUserPage(UpdateUserRequest userRequest){
        getClientAreaButton().click();

        getFirstName().click();
        getFirstName().clear();
        getFirstName().sendKeys(userRequest.getFirstName());

       getLastName().click();
       getLastName().clear();
       getLastName().sendKeys(userRequest.getLastName());

        getCompany().click();
        getCompany().clear();
        getCompany().sendKeys(userRequest.getCompany());


        getEmailField().click();
        getEmailField().clear();
        getEmailField().sendKeys(userRequest.getEmail());

        getCountryFromTheListOfCountries(userRequest.getCountry().getCountryNumberSelect()).click();

        getInputPhoneField().click();
        getInputPhoneField().clear();
        getInputPhoneField().sendKeys(userRequest.getPhoneNumber());

        getStreetAddressField().click();
        getStreetAddressField().clear();
        getStreetAddressField().sendKeys(userRequest.getAddress());

        getStreetAddress2Field().click();
        getStreetAddress2Field().clear();
        getStreetAddress2Field().sendKeys(userRequest.getAddress2());

        getCityField().click();
        getCityField().clear();
        getCityField().sendKeys(userRequest.getCity());

        getStateField().click();
        getStateField().clear();
        getStateField().sendKeys(userRequest.getState());

        getPostcodeField().click();
        getPostcodeField().clear();
        getPostcodeField().sendKeys(userRequest.getPostalCode());

        selectCountry(userRequest.getCountry().getTwoLetterCountry());

       selectPaymentMethode(userRequest.getPaymentMethode());


        getInputPaymentMethodField().click();
        getInputPaymentMethodField().clear();
        getInputPaymentMethodField().sendKeys(userRequest.getPaymentMethode());

        getInputBillingContactField().click();
        getInputBillingContactField().clear();
        getInputBillingContactField().sendKeys(userRequest.getDefaultBillingContact());


        getMobileField().click();
        getMobileField().clear();
        getMobileField().sendKeys(userRequest.getMobile());



        getSaveButton().click();

        return new UpdateUserPage(driver, url, email, password);
    }




}
