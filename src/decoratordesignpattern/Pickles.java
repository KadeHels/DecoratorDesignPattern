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
public class Pickles extends ToppingDecorator{
    
    public Pickles(PlainBurger newBurger) {
        super(newBurger);
        System.out.println("Adding Pickles ");
    }
    
    public String getDescription(){
        return tempBurger.getDescription() + ", Pickels";
    }
    public double getCost(){
        return tempBurger.getCost() + .25;
    }
}
