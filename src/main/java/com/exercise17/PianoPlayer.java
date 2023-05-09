package com.exercise17;

public class PianoPlayer extends Player{
    public PianoPlayer(String name, String favoriteGenre) {
        super(name, favoriteGenre);
    }

    @Override
    public void play() {
        System.out.println("Playing Bach");
    }

    @Override
    public void compose() {
        System.out.println("composing piano melody ");
    }

    public void practice(){
        System.out.println("practice makes perfect!");
    }

    public void playJazz(){
        System.out.println("Playing I Got Rhythm by George Gershwin");
    }

    @Override
    public String toString() {
        return "PianoPlayer{" +
                "name='" + this.getName() + '\'' +
                ", favoriteGenre='" + this.getFavoriteGenre() + '\'' +
                '}';
    }
}
