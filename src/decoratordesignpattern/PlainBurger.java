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
public class PlainBurger implements IHamburger {

    @Override
    public String getDescription() {
        return "Plain Hamburger";
    }

    @Override
    public double getCost() {
       return 3.00;
    }
    
}
