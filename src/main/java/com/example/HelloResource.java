package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello, World!!!\n Added second string!!!!\nIt's eleven trying?\n" +
                "Added global adress!!!\n" +
                "it's possible for 1 tunnel if you use free account";


    }
}