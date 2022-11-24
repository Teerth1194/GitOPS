package com.reqres.api.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reqres.api.helpers.userHelper;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPUTuser {

    private userHelper userhelper;

    @BeforeClass
    public void init(){
        userhelper = new userHelper();
    }

    @Test
    public void testPatch() throws JsonProcessingException {
        Response response = userhelper.UpdateUser("9");
        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
    }
}
