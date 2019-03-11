/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlan
 */
public class Car extends PoweredVehicle {
    private int myEngineSize;


    public Car(int myEngineSize, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineSize = myEngineSize;
    }

    @Override
    public void toprint() {
        System.out.println("I am Car");
    }
    public void Lost(){
        System.out.println("I am Lost Car");
    }
    
}
