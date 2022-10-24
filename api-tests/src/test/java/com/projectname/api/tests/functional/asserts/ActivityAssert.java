package com.projectname.api.tests.functional.asserts;

import com.projectname.api.client.data.model.users.fakerestApi.Activity;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ActivityAssert {
    public SoftAssert softAssert = new SoftAssert();

    public void assertListOfActivities(List<Activity> activityResponse) {
        for (int i = 0; i < activityResponse.size(); i++) {
            softAssert.assertFalse(activityResponse.get(i).getId() < 0, "ID is less than 0");
            softAssert.assertFalse(activityResponse.get(i).getTitle().isEmpty(), "Title is empty");
            softAssert.assertFalse(activityResponse.get(i).getDueDate().isEmpty(), "Due date is  empty");
        }
        softAssert.assertAll();
    }

    public void assertActivityById(Activity activityResponse){
        softAssert.assertFalse(activityResponse.getId() < 0, "ID is less than 0");
        softAssert.assertFalse(activityResponse.getTitle().isEmpty(), "Title is empty");
        softAssert.assertFalse(activityResponse.getDueDate().isEmpty(), "Due date is  empty");

        softAssert.assertAll();
    }

    public void assertActivityResponses(Activity actualResponse, Activity expectedResponse) {
        if (actualResponse == null) {
            Assert.fail("Activity is not updated");
        }
        softAssert.assertEquals(actualResponse.getId(), expectedResponse.getId(), "ID did not match");
        softAssert.assertEquals(actualResponse.getTitle(), expectedResponse.getTitle(), "Title did not match");
        softAssert.assertEquals(actualResponse.getDueDate(), expectedResponse.getDueDate(), "Due date did not match");
        softAssert.assertEquals(actualResponse.isCompleted(), expectedResponse.isCompleted(), "Completion status did not match");

        softAssert.assertAll();
    }
}
