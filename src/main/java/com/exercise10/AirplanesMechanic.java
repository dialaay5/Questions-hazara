package com.exercise10;

public class AirplanesMechanic extends Mechanic{
    protected int rank;

    public AirplanesMechanic(String name, int years_of_experience, int rank) {
        super(name, years_of_experience);
        this.rank = rank;
    }

    @Override
    public void repair() {
       System.out.println("repairing airplane..");
    }

    public void checkEngine(){
        System.out.println("checking the engine.");
    }

    @Override
    public String toString() {
        return "AirplanesMechanic{" +
                "super:[" + super.toString() + "] " +
                "rank=" + rank +
                '}';
    }
}
