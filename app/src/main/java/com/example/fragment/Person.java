package com.example.fragment;

public class Person {
    String name;
    String phone;
    int image;

    public Person(String name,String phone,int image) {
        this.image=image;
        this.name = name;
        this.phone=phone;
    }
    public Person(String name,String phone) {
        this.name = name;
        this.phone=phone;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image=image;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
