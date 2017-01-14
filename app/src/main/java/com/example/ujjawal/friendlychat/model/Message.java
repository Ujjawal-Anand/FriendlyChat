package com.example.ujjawal.friendlychat.model;

/**
 * Created by ujjawal on 13/1/17.
 */

public class Message {
    private String uid;
    private String text;
    private String photoUrl;
    private String author;

    public Message() {}

    public Message(String uid, String text, String author, String photoUrl) {
        this.uid = uid;
        this.text = text;
        this.author = author;
        this.photoUrl = photoUrl;
    }

    public String getUid() {
        return uid;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
