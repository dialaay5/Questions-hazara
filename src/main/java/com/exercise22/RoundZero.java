package com.exercise22;

public class RoundZero {
    public static double RoundUp(double number){
        if(number > 0 && number <= 1){
            return Math.ceil(number);
        }
        else if (number == 0) {
            return 0.0;
        }
        return -1.0;
    }

    public static double RoundDown(double number){
        if(number < 1 && number >= 0){
            return Math.floor(number);
        }
        else if(number == 1){
            return 1.0;
        }
        return -1.0;
    }

    public static double Round(double number){
        if(number >= 0.5 && number <= 1){
            return Math.ceil(number);
        } else if (number < 0.5 && number >= 0){
            return 0.0;
        }
        return -1.0;
    }
}
