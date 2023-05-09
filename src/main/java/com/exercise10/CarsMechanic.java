package com.exercise10;

import java.time.LocalTime;
import java.util.Arrays;

public class CarsMechanic extends Mechanic{
    protected String[] car_types_i_can_repair;

    public CarsMechanic(String name, int years_of_experience,String[] car_types_i_can_repair ) {
        super(name, years_of_experience);
        this.car_types_i_can_repair = car_types_i_can_repair;
    }

    @Override
    public void repair() {
        System.out.println("repairing car..");
        if(LocalTime.now().getHour() > 17 || LocalTime.now().getHour() < 7){
            System.out.printf("it's %s:00 o'clock..garage is closed\n" , LocalTime.now().getHour());
        }
        else {
            System.out.printf("it's %s:00 o'clock..garage is open\n" , LocalTime.now().getHour());
        }
    }

    public void replaceWheel(){
        System.out.println("replacing the damaged wheel.");
    }

    @Override
    public String toString() {
        return "CarsMechanic{" +
                "super:[" + super.toString() + "] " +
                "car_types_i_can_repair=" + Arrays.toString(car_types_i_can_repair) +
                '}';
    }
}
