package com.ak.demoGif.model;

public class Gif {

    private String name;
    private String userName;
    private Boolean favorite;

    public Gif(String name, String userName, Boolean favorite) {
        this.name = name;
        this.userName = userName;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
