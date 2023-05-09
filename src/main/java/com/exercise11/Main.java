package com.exercise11;

public class Main {
    public static void main(String[] args) {
        System.out.println("We cannot override the final method in java. If we try to override the final method in java,\n"+
                "we get a compilation error because if we are declaring any method with the final keyword,\n"+
                "we are indicating the JVM to provide some special attention and make sure no one can override it.\n");

        ElectricDevice tv = new TV(65.5f);
        System.out.println(tv.worksOnBatteries);
        System.out.println(tv.isFaulty);

        ElectricDevice cellphone = new Cellphone("Samsung");
        System.out.println(cellphone.worksOnBatteries);
        System.out.println(cellphone.isFaulty);

        repairElecticDevice(tv);
        repairElecticDevice(cellphone);

    }
    public static void repairElecticDevice(ElectricDevice electricDevice){
            if(electricDevice.worksOnBatteries){
                electricDevice.insertNewBatteries();
            }
            if(electricDevice instanceof TV) {
                System.out.println(((TV) electricDevice).screen_size);
            }
            else if(electricDevice instanceof Cellphone) {
                System.out.println(((Cellphone) electricDevice).brand);
            }
        if(!electricDevice.isFaulty){
            return;
        }
        electricDevice.fixDevice();
        System.out.println("fixing is done.");


    }
}
