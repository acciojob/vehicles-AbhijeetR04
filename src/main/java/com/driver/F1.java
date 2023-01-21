package com.driver;

public class F1 extends Car {
    private String name;
    private boolean isManual;
    public  F1(String name, boolean isManual) {
        super();
        this.name = name;
        this.isManual = isManual;
        //Use arbitrary values for parameters which are not mentioned
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed = getCurrentSpeed() + rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop();
            changeGear(1);
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0 && newSpeed <= 50) {
            changeSpeed(newSpeed, getCurrentDirection());
            changeGear(1);
        }
        if(newSpeed > 50 && newSpeed <= 100){
            changeSpeed(newSpeed , getCurrentDirection());
            changeGear(2);
        }
        if(newSpeed > 100 && newSpeed <= 150){
            changeSpeed(newSpeed , getCurrentDirection());
            changeGear(3);
        }
        if(newSpeed > 150 && newSpeed <= 200){
            changeSpeed(newSpeed , getCurrentDirection());
            changeGear(4);
        }
        if(newSpeed > 200 && newSpeed <= 250){
            changeSpeed(newSpeed , getCurrentDirection());
            changeGear(5);
        }
        if(newSpeed > 250){
            changeSpeed(newSpeed , getCurrentDirection());
            changeGear(6);
        }
    }
}
