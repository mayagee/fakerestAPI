package com.projectname.api.client.calls;

import com.projectname.api.client.data.model.users.fakerestApi.Activity;
import com.projectname.api.client.data.model.users.fakerestApi.EmptyResponse;
import com.projectname.api.client.constants.ApiEndpoints;
import com.projectname.api.client.utils.GsonFunctions;
import com.projectname.api.client.utils.RestAssuredFunctions;

import java.util.List;

public class ActivityAPI {
    public static List<Activity> activityResponse() {
        return GsonFunctions.parseSuccessResponseAsListToModel(RestAssuredFunctions.get(ApiEndpoints.GET_ACTIVITY), Activity[].class);
    }

    public static Activity createActivityResponse (Activity activityRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post(ApiEndpoints.GET_ACTIVITY, String.valueOf(activityRequest)), Activity.class);
    }

    public static Activity getActivityById (int id){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(ApiEndpoints.GET_ACTIVITY_BY_ID(id)),Activity.class);
    }

    public static Activity putActivityById (int id, Activity activityRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.put(activityRequest, ApiEndpoints.GET_ACTIVITY_BY_ID(id)), Activity.class);
    }

    public static EmptyResponse deleteActivityById (int id){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.delete(ApiEndpoints.GET_ACTIVITY_BY_ID(id)), EmptyResponse.class);
    }

}