package com.ivoronline.springbott_quickstart_json_print;

import io.swagger.v3.core.util.Json;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(SpringbootApplication.class, args);
    
    //CREATE OBJECT
    Person person      = new Person();
           person.name = "John";
           person.age  = 20;
           
    //PRINT OBJECT
    String personJson = Json.pretty(person);
    System.out.println(personJson);
    
  }
  
}
