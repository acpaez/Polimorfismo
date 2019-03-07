
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public abstract class Vehicle {
    private String myBrand;
    private String myModel;
    public ArrayList<Vehicle> vehicles;

    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
        vehicles=new ArrayList<Vehicle>();
    }
    public void toprint(){
        System.out.println("I am class father vehicle");
    }
    public void Vehiclemetod(){
        System.out.println("vehicle metod");
    }
    public String getMyBrand() {
        return myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
