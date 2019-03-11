/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlan
 */
public abstract class PoweredVehicle extends Vehicle{
    private String myFuelType;

    public PoweredVehicle(String myBrand, String myModel,String myFuelType) {
        super(myBrand, myModel);
        this.myFuelType = myFuelType;
    }


    @Override
    public void toprint() {
        System.out.println("I am Powered Vehicle");
    }

    public void ImOne(){
        System.out.println("I am One Powered Vehicle");
    }
    
}