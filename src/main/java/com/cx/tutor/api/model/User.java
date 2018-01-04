package com.cx.tutor.api.model;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Component;

@Component
 public class User {
    private long id;
    private String name;
    private int age ;

    //无参数的构造器
    public  User(){

    }
    //有参数的构造器
    public  User(long id,String name, int age){
        this.id = id;
        this.name=name;
        this.age = age;
    }

     public long getId() {
         return id;
     }

     public void setId(long id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }

