package me.dio.domain.model;

import jakarta.persistence.*;

@Entity
public class List {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Integer id;
    @Column(nullable = false)
    private Integer gameId;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public Integer getGameId(){
        return gameId;
    }
    public void setGameId(Integer gameId){
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", gameId=" + gameId +
                '}';
    }
}
