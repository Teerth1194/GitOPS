package com.reqres.api.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class userJson {

    public String userBody() throws JsonProcessingException {
        User user = new User();
        user.setUserName("Teerth_Update");
        user.setId(1);
        user.setPassword("teerthPass");

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
    }

}
