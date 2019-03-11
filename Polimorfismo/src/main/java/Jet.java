/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlan
 */
public class Jet extends PoweredVehicle{
    private int myEngineCount;

    public Jet(int myEngineCount, String myFuelType, String myBrand, String myModel) {
        super(myFuelType, myBrand, myModel);
        this.myEngineCount = myEngineCount;
    }

    @Override
    public void toprint() {
        System.out.println("I am Jet");
    }
    public void Lost (){
        System.out.println("I am lost Jet");
    }
    
}