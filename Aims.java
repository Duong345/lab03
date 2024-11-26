public class Aims {
    public static void main(String[] args) {
        // Create a Cart object
        Cart anOrder = new Cart();
        System.out.println("A cart has been created");

        // Add single discs with messages
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 8.20f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 9.50f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Unknown", 90, 6.90f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Print total cost and quantity after first addition
        System.out.printf("The total cost is: %.3f\n", anOrder.totalCost());
        System.out.println("The number of discs is: " + anOrder.getQuantityOrdered());
        System.out.println();

        // Add two more discs
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter", "Fantasy", "Chris Columbus", 152, 20.0f);
        anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 19.99f);
        anOrder.addDigitalVideoDisc(dvd5);

        // Print total cost and quantity after second addition
        System.out.printf("The total cost is: %.3f\n", anOrder.totalCost());
        System.out.println("The number of discs is: " + anOrder.getQuantityOrdered());
        System.out.println();

        // Add a series of discs
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 12.99f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Frozen", "Animation", "Jennifer Lee", 102, 7.99f);
        DigitalVideoDisc[] dvdList = {dvd6, dvd7};
        anOrder.addDigitalVideoDisc(dvdList);

        // Print final total cost and quantity
        System.out.printf("The total cost is: %.3f\n", anOrder.totalCost());
        System.out.println("The number of discs is: " + anOrder.getQuantityOrdered());
    }
}
