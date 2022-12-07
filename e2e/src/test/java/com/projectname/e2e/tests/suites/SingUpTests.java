package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.asserts.PhpTravelAssert;
import com.projectname.e2e.tests.data.model.RegisterUserRequest;
import com.projectname.e2e.tests.data.model.UpdateUserRequest;
import com.projectname.e2e.tests.data.model.UserPageDetails;
import com.projectname.e2e.tests.data.provider.phptravels.PhpTravelsProvider;
import com.projectname.e2e.tests.pages.*;
import com.projectname.e2e.tests.pages.navigation.bar.NavigationBarPage;
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.annotations.Test;

public class SingUpTests extends TestBase {

    @Test
    public void verifyUserRegistered(){
       NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(),"","","");
      navigationBarPage.show();

        SingUpPage singUpPage = new SingUpPage(getDriver(),"","","");
        singUpPage.show();

        RegisterUserRequest userRequest = PhpTravelsProvider.prepareRegisterUserRequest();

        UserPage userPage = singUpPage.registerNewUser(userRequest);

        UserPageDetails actualUserDetails = userPage.getActualUserDetails();

        UserPageDetails expectedUserDetails = new UserPageDetails().parseExpectedUserDetails(userRequest);

        PhpTravelAssert phpTravelAssert = new PhpTravelAssert();
        phpTravelAssert.assertUserDataOnUserPage(actualUserDetails, expectedUserDetails);



    }

@Test
    public void verifyUserUpdated(){

    LoginPage loginPage =new LoginPage(getDriver(), "", "", "");
    loginPage.show();

    loginPage.loginUser();

    UpdateUserPage updateUserPage = new UpdateUserPage(getDriver(),"","","");
    updateUserPage.show();


    UpdateUserRequest userRequest = PhpTravelsProvider.prepareUpdateUserRequest();

    updateUserPage.updateUserPage(userRequest);


    UserPage userPage = new UserPage(getDriver(), "","","");
    userPage.isDisplayed();

    UserPageDetails actualUserDetails1 = userPage.getActualUserDetails();

    UserPageDetails expectedUserDetails = UserPageDetails.parseExpectedUpdatedUserDetails(userRequest);

    PhpTravelAssert phpTravelAssert = new PhpTravelAssert();
    phpTravelAssert.assertUpdatedUserPage(actualUserDetails1, expectedUserDetails);

}



}
