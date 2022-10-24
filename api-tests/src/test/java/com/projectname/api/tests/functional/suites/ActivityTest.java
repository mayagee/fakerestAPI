package com.projectname.api.tests.functional.suites;

import com.projectname.api.client.data.model.users.fakerestApi.Activity;
import com.projectname.api.client.data.model.users.fakerestApi.EmptyResponse;
import com.projectname.api.client.calls.ActivityAPI;
import com.projectname.api.tests.constants.DataProviderNames;
import com.projectname.api.tests.data.provider.ActivityProvider;
import com.projectname.api.tests.functional.asserts.ActivityAssert;
import com.projectname.api.tests.init.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.projectname.api.client.utils.Allure.logStep;

public class ActivityTest extends TestBase {
    ActivityAssert activityAssert = new ActivityAssert();

    @Test
    public void getListOfActivities() {
        List<Activity> getActivitiesResponse = ActivityAPI.activityResponse();
        activityAssert.assertListOfActivities(getActivitiesResponse);
    }

    @Test
    public void getActivityById() {
        Activity getActivityById = ActivityAPI.getActivityById(12);
        activityAssert.assertActivityById(getActivityById);
    }

    // create testovi nisu dobri, nacicu gde gresim pa cu ispravit
    @Test
    public static void verifyCreateActivity() {

        Activity createActivityRequest = new Activity(32, "New title", "2022-10-21T09:09:02.0847715+00:00", false);

        logStep("INFO: Create activity");
        Activity createActivityActual = ActivityAPI.createActivityResponse(createActivityRequest);
        logStep("PASS: Activity is created");

         Activity createActivityExpected = Activity.parseExpectedActivityResponse(createActivityRequest);

        ActivityAssert activityAssert = new ActivityAssert();
        logStep("INFO: Verify user is created");
        activityAssert.assertActivityResponses(createActivityActual, createActivityExpected);
        logStep("PASS: Response is verified");


    }

    @Test( dataProvider = DataProviderNames.VERIFY_CREATE_ACTIVITY, dataProviderClass = ActivityProvider.class)
    public static void verifyCreateActivity(String methodNameSuffix, Activity createActivityRequest) {

        logStep("INFO: Create Activity");
        Activity createActivityActual = ActivityAPI.createActivityResponse(createActivityRequest);
        logStep("PASS: Activity is created");

        Activity createActivityExpected = Activity.parseExpectedActivityResponse(createActivityRequest);

        ActivityAssert activityAssert = new ActivityAssert();
        logStep("INFO: Verify Activity is created");
        activityAssert.assertActivityResponses(createActivityActual, createActivityExpected);
        logStep("PASS: Response is verified");

    }


    @Test(dataProvider = DataProviderNames.VERIFY_UPDATE_ACTIVITY, dataProviderClass = ActivityProvider.class)
    public static void verifyUpdateActivityById(String suffix, Activity updateActivityRequest){
        Activity actualResponse = ActivityAPI.putActivityById(30, updateActivityRequest);

        Activity expectedResponse = Activity.parseExpectedActivityResponse(updateActivityRequest);

        ActivityAssert activityAssert = new ActivityAssert();
        activityAssert.assertActivityResponses(actualResponse, expectedResponse);
    }

    @Test
    public static void verifyDeleteActivityById(){
        EmptyResponse actualResponse = ActivityAPI.deleteActivityById(11);
        Assert.assertNull(actualResponse);

    }
}
