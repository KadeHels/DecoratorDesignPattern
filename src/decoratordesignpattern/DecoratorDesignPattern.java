
package decoratordesignpattern;

/**
 *
 * @author Kade
 */
public class DecoratorDesignPattern {

    public static void main(String[] args) {
        System.out.println("Start:");
        System.out.println("Making Cheese Hamburger with Ketchup and Pickles");
        
        PlainBurger burger = new Pickles(new Ketchup(new Cheese(new PlainBurger())));
        
        System.out.println();
        System.out.println("Done Making the Burger");
        
        System.out.println("Description: " + burger.getDescription());
        System.out.println("Cost: " + "$" +  burger.getCost());
    }
    
}
