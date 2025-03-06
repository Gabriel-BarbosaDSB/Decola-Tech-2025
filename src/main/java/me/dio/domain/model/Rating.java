package me.dio.domain.model;

public class Rating {
    private String gameId;
    private Double stars;

    public String getGameId(){
        return gameId;
    }
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Double getStars(){
        return stars;
    }
    public void setStars(Double stars){
        if (stars < 1 || stars > 5){
            throw new IllegalArgumentException("Stars must be between 1 and 5");
        }
    }
}
