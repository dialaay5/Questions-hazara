package com.exercise11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TV extends ElectricDevice{
    protected float screen_size;

    public TV(float screen_size) {
        super(false);
        this.screen_size = screen_size;
    }


    @Override
    public void useDevice() {
        System.out.println("watching tv..");
    }

    @Override
    public void fixDevice() {
        if(super.isFaulty){
            System.out.println("fixing tv..");
            super.isFaulty = false;
        }
        else{
            System.out.println("this tv is working properly");
        }
    }
}
