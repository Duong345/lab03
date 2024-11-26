package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a cart
        Cart cart = new Cart();

        // Create DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title 1", "Category 1", "Directory 1", 100, 10.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title 2", "Category 2", "Directory 2", 120, 15.0f);

        // Add DVDs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);

        // Display the cart
        cart.displayCart();

        // Check total cost
        System.out.printf("The total cost is: %.2f\n", cart.totalCost());

        // Check quantity ordered
        System.out.println("The number of discs in the cart is: " + cart.getQtyOrdered());
    }
}
