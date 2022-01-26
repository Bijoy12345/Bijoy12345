package com.bijoy.customerrecicler;

public class Contact {

    private String name, email, phone, blood_group, profile_img;

    public Contact(String name, String email, String phone, String profile_img, String blood_group) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.blood_group = blood_group;
        this.profile_img = profile_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }
}


