package me.dio.domain.model;

public class Game {
    private Integer id;
    private String name;
    private String gameIcon;
    private String description;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getGameIcon(){
        return gameIcon;
    }
    public void setGameIcon(String Icon){
        this.gameIcon = gameIcon;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
