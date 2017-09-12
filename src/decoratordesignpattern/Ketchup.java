/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesignpattern;

/**
 *
 * @author Kade
 */
public class Ketchup extends ToppingDecorator{
    
    public Ketchup(PlainBurger newBurger) {
        super(newBurger);
        System.out.print("Adding Ketcup ");
    }
    
    public String getDescription(){
        return tempBurger.getDescription() + ", Ketcup";
    }
    
    public double getCost(){
        return tempBurger.getCost() + .5;
    }
}
