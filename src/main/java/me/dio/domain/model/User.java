package me.dio.domain.model;

public class User {
    private Integer id;
    private String email;
    private String name;
    private String password;
    private String userIcon;

    public Integer getId(){

        return id;
    }
    public void setId(Integer id) {

        this.id = id;
    }

    public String getEmail(){

        return email;
    }
    public void setEmail(String email){

        this.email = email;
    }

    public String getName(){

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getPassword(){

        return password;
    }
    public void setPassword(String password){

        this.password = password;
    }

    public String getUserIcon(){

        return userIcon;
    }
    public void setUserIcon(String Icon){

        this.userIcon = userIcon;
    }
}
