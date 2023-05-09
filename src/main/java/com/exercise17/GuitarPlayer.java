package com.exercise17;

public class GuitarPlayer extends Player{

    public GuitarPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void play() {
        System.out.println("Playing Hotel California");
    }

    @Override
    public void compose() {
        System.out.println("composing guitar melody ");
    }

    public void rockAndRoll(){
        System.out.println("Let the show begin!");
    }

    @Override
    public String toString() {
        return "GuitarPlayer{" +
                "name='" + this.getName()+ '\'' +
                ", favoriteGenre='" + this.getFavoriteGenre() + '\'' +
                '}';
    }
}
