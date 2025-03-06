package me.dio.domain.model;

import java.util.ArrayList;

public class User {
    private String id;
    private String name;
    private String password;
    private String birthday;
    private ArrayList<String> gamesList;

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ArrayList<String> getGamesList() {
        return gamesList;
    }
    public void setGamesList(ArrayList<String> gamesList) {
        this.gamesList = gamesList;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
