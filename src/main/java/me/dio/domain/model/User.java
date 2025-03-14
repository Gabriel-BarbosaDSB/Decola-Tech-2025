package me.dio.domain.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(nullable = false)
    private String icon;

    public Integer getId(){

        return id;
    }
    public void setId(Integer id) {

        this.id = id;
    }

    public String getName(){

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){

        return password;
    }
    public void setPassword(String password){

        this.password = password;
    }

    public String getIcon(){

        return icon;
    }
    public void setIcon(String Icon){

        this.icon = icon;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
