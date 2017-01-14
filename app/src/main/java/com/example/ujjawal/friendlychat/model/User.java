package com.example.ujjawal.friendlychat.model;

/**
 * Created by ujjawal on 13/1/17.
 */

public class User {
    private String name;
    private String profilePicUrl;
    private String email;

    public User() {}
    public User(String name, String email, String profilePicUrl) {
        this.name = name;
        this.email = email;
        this.profilePicUrl = profilePicUrl;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }
}
