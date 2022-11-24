package com.reqres.api.test;

import com.reqres.api.helpers.userHelper;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGETuser {


    private userHelper userhelper;

    @BeforeClass
    public void init(){
        userhelper = new userHelper();
    }

    @Test
    public void TestGet(){
        Response response = userhelper.getAllUser();
        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        //Assert.assertEquals(response.jsonPath().get("id[0]"));
    }

}
