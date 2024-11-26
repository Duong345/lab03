public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Unknown", 90, 18.99f);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Print the cart contents
        cart.printCart();

        // Search by ID
        System.out.println("\nSearch by ID (2):");
        cart.searchById(2);

        // Search by Title
        System.out.println("\nSearch by Title ('Star'):");
        cart.searchByTitle("Star");

        // Remove a DVD and print the updated cart
        cart.removeDigitalVideoDisc(dvd2);
        System.out.println("\nAfter removing 'Star Wars':");
        cart.printCart();
    }
}
