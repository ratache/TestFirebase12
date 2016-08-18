package com.example.koan.testfirebase1;

/**
 * Created by Koan on 2016-08-10.
 */
public class Person {
    //name address string
    private String name;
    private String address;

    public Person(){
        //Blank default constructor important for Firebase
    }

    public String getName(){return name;}

    public String getAddress(){return address;}

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
