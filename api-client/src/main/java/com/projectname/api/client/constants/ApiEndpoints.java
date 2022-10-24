package com.projectname.api.client.constants;

//List of endpoint as constants
public class ApiEndpoints {

    //User Endpoints
    public static final String USERS = "api/users";
    public static final String users(String userId) {
        return USERS + "/" + userId;
    }

    public static final String GET_ACTIVITY = "/api/v1/Activities";
    public static final String GET_ACTIVITY_BY_ID(int id) {return GET_ACTIVITY + "/"+ id;}
    public static final String GET_BOOK = "/api/v1/Books";
    public static final String GET_BOOK_BY_ID(int id) {return GET_BOOK + "/"+ id;}

}
