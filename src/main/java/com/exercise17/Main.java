package com.exercise17;

import com.exercise11.TV;

public class Main {
    public static void main(String[] args) {
        IPlayer guitarPlayer = new GuitarPlayer("suzi", "Electronic music");
        IPlayer pianoPlayer = new PianoPlayer("tomas", "Classical music");
        System.out.println(guitarPlayer);
        System.out.println(pianoPlayer);

        IPlayer[] player = {guitarPlayer,pianoPlayer};

        startMusicShow(player[0]);
        System.out.println(" ");
        startMusicShow(player[1]);


    }
    public static void startMusicShow(IPlayer player) {
        player.play();
        if (player instanceof GuitarPlayer) {
            ((GuitarPlayer) player).rockAndRoll();
        } else if (player instanceof PianoPlayer) {
            ((PianoPlayer) player).playJazz();
        }
    }

}
