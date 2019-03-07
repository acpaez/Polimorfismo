/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public class  Bicicle extends Vehicle {
    private int myGearCount;

    public Bicicle(int myGearCount, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.myGearCount = myGearCount;
    }

    @Override
    public void toprint() {
        System.out.println("I am Bicicle");
    }
    public void imOne(){
         System.out.println("I am One Bicicle");
     }
    
}
