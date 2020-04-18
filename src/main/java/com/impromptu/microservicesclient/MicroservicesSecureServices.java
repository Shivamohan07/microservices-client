package com.impromptu.microservicesclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@EnableResourceServer
public class MicroservicesSecureServices {
    public static void main(String[] args) {
        SpringApplication.run(MicroservicesSecureServices.class, args);
    }

    @RequestMapping("/getData")
    public ArrayList<Property> getData(){
        Property property1 = new Property("1","test");
        Property property2 = new Property("2","test2");
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(property1);
        properties.add(property2);
        return properties;
    }
    public class Property{
        public String prop1;
        public  String prop2;
        public Property(){}
        public Property(String prop1, String prop2){
            this.prop1=prop1;
            this.prop2=prop2;
        }
    }

}
