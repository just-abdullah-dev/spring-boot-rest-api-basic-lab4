package com.example.demo.data;

public class Players {
    String name;
    String id;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Players(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


}
