/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public class SkateBoard extends Vehicle {
    private int MyBoardLength;

    public SkateBoard(int MyBoardLength, String myBrand, String myModel) {
        super(myBrand, myModel);
        this.MyBoardLength = MyBoardLength;
    }

    @Override
    public void toprint() {
        System.out.println("I am Skate Board");
    }
    public void imOne(){
        System.out.println("I am One Skate Board");
    }
}
