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
abstract public class ToppingDecorator extends PlainBurger{
    protected PlainBurger tempBurger;
    
    public ToppingDecorator(PlainBurger newBurger){
        this.tempBurger = newBurger;
    }
    
    public String getDescription(){
        return this.tempBurger.getDescription();
    }
    
    public double getCost(){
        return this.tempBurger.getCost();
    }
}
