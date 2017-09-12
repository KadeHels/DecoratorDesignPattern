package decoratordesignpattern;

/**
 *
 * @author Kade
 */
public class Cheese extends ToppingDecorator {
    
    public Cheese(PlainBurger newBurger) {
        super(newBurger);
        System.out.print("Adding Cheese ");
    }
    
    public String getDescription(){
        return tempBurger.getDescription() + ", Cheese";
    }
    
    public double getCost(){
        return tempBurger.getCost() + .10;
    }
}
