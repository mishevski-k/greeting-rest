package com.example.restservice;

/**
 * Domain/Model for our greating object
 *
 * @author Kiril Mishevski
 * @version 1.0.0
 * @since 1/3/2023
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
