package com.projectname.api.client.calls;

import com.projectname.api.client.constants.ApiEndpoints;
import com.projectname.api.client.data.model.users.fakerestApi.Book;
import com.projectname.api.client.data.model.users.fakerestApi.EmptyResponse;
import com.projectname.api.client.utils.GsonFunctions;
import com.projectname.api.client.utils.RestAssuredFunctions;

import java.util.List;

public class BookAPI {
    public static List<Book> bookResponse() {
        return GsonFunctions.parseSuccessResponseAsListToModel(RestAssuredFunctions.get(ApiEndpoints.GET_BOOK), Book[].class);
    }

    public static Book createBookResponse (Book bookRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post(ApiEndpoints.GET_BOOK, String.valueOf(bookRequest)), Book.class);
    }

    public static Book getBookById (int id){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get(ApiEndpoints.GET_BOOK_BY_ID(id)),Book.class);
    }

    public static Book putBookById (int id, Book bookRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.put(bookRequest, ApiEndpoints.GET_BOOK_BY_ID(id)), Book.class);
    }

    public static EmptyResponse deleteBookById (int id){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.delete(ApiEndpoints.GET_BOOK_BY_ID(id)), EmptyResponse.class);
    }
}
