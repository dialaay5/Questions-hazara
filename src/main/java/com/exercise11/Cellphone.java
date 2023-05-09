package com.exercise11;

public class Cellphone extends ElectricDevice{
    protected String brand;

    public Cellphone(String brand) {
        super(true);
        this.brand = brand;
    }

    @Override
    public void useDevice() {
        System.out.println("talking on the phone.");
    }

    @Override
    public void fixDevice() {
        if(super.isFaulty){
            System.out.println("fixing cellphone..");
            super.isFaulty = false;
        }
        else{
            System.out.println("this cellphone is working properly");
        }

    }
}
