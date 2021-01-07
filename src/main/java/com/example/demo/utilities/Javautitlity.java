package com.example.demo.utilities;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Javautitlity {
    public static String getJsonFromObject(Object object){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(Include.NON_NULL);
            String  json =  mapper.writeValueAsString(object);

            return json ;
        }
        catch(JsonProcessingException ex){
            System.out.println(ex);
        }
        return "";
    }
    
}
