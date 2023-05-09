package com.exercise10;

public abstract class Mechanic {
    protected String name;
    protected int years_of_experience;

    public Mechanic(String name, int years_of_experience) {
        this.name = name;
        this.years_of_experience = years_of_experience;
    }

    public abstract void repair();
    public void useScrewdriver(){
        System.out.println("Using screwdriver to open this screw..");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", years_of_experience=" + years_of_experience +
                '}';
    }
}
