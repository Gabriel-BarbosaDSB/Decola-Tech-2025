package me.dio.domain.model;

import java.util.ArrayList;

public class Game {
    private String id;
    private String name;
    private String icon;
    private String description;
    private ArrayList<String> type;
    private ArrayList<String> platform;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getIcon(){
        return icon;
    }
    public void setIcon(String Icon){
        this.icon = icon;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public ArrayList<String> getType(){
        return type;
    }
    public void setType(ArrayList<String> type){
        this.type = type;
    }

    public ArrayList<String> getPlatform(){
        return platform;
    }
    public void setPlatform(ArrayList<String> platform){
        this.platform = platform;
    }
}
