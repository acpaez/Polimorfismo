/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c-les
 */
public class Principal {
    
    public void menu(){
        Vehicle vh= new Bicicle(12,"chevrolet","camaro");
        
        vh.getVehicles().add(vh);
        vh.getVehicles().add(new SkateBoard(30,"mango","lx"));
        vh.getVehicles().add(new Car(1,"energy","audi","ln"));
        vh.getVehicles().add(new Jet(19,"energy","alt","mx"));
        
       
        for (Vehicle vehicle: vh.vehicles){
            
            if (vehicle instanceof Bicicle){
                ((Bicicle) vehicle).toprint();
                ((Bicicle) vehicle).imOne();
            }
            if (vehicle instanceof SkateBoard){
                ((SkateBoard) vehicle).toprint();
                ((SkateBoard) vehicle).imOne();
            }
            if (vehicle instanceof Car){
                ((Car) vehicle).toprint();
                ((Car) vehicle).Lost();
            }
            if (vehicle instanceof Jet){
                ((Jet) vehicle).toprint();
                ((Jet) vehicle).Lost();
            }
        }
    }
}
