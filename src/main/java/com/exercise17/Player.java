package com.exercise17;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Player implements IPlayer{
    protected String name;
    protected String favoriteGenre;

    public Player(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }
}
