package me.dio.domain.model;

public class Rating {
    private Integer gameId;
    private Integer stars;

    public Integer getGameId(){
        return gameId;
    }
    public void setGameId(Integer gameId) {
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
}
