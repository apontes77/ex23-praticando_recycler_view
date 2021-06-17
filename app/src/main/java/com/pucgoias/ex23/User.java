package com.pucgoias.ex23;

public class User {
    private  String name;
    private String email;
    private String telephone;
    private String urlPhoto;

    public User() {
    }

    public User(String name, String email, String telephone, String urlPhoto) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.urlPhoto = urlPhoto;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }



}
