package com.reqres.api.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reqres.api.constant.Endpoints;
import com.reqres.api.models.userJson;
import com.reqres.api.utils.configManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class userHelper {

    //we need to read config variable
    // Tell about url
    // make a GET request and send data to TestGETUser

    private static final String BASE_URL = configManager.getInstance().getstring("baseUrl");

    userJson ujson= new userJson();

    public userHelper(){
//        System.out.println(BASE_URL);
        RestAssured.baseURI = BASE_URL;
    }

    public Response getAllUser(){

        Response response = given().
                contentType(ContentType.JSON).
                when().
                get(Endpoints.GET_ALL_USER).
                andReturn();

        return response;
    }

    public Response Createuser() throws JsonProcessingException {

        Response response = given().
                contentType(ContentType.JSON).body(ujson.userBody()).
                when().
                post(Endpoints.CREATE_USER).
                andReturn();

        return response;
    }

    public Response UpdateUser(String i) throws JsonProcessingException {

        System.out.println(String.format(RestAssured.baseURI  + Endpoints.UPDATE_USER,i));
        Response response = given().
                contentType(ContentType.JSON).
                body(ujson.userBody()).when().
                put(String.format(Endpoints.UPDATE_USER,i)).
                andReturn();

        return response;

    }




}
