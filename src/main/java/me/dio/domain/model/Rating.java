package me.dio.domain.model;

import jakarta.persistence.*;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_id")
    private Integer id;
    @Column(nullable = false)
    private Integer gameId;
    @Column(length = 1, nullable = false)
    private Integer stars;

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

    public Integer getStars(){

        return stars;
    }
    public void setStars(Integer stars){
        if (stars < 1 || stars > 5){
            throw new IllegalArgumentException("Stars must be between 1 and 5");
        } else{
            this.stars = stars;
        }
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", gameId=" + gameId +
                ", stars=" + stars +
                '}';
    }
}
