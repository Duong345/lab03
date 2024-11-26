public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int quantityOrdered = 0;

    // Add a single disc
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (quantityOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Cannot add more items.");
            return;
        }
        itemsOrdered[quantityOrdered] = disc;
        quantityOrdered++;

        if (quantityOrdered == 1) {
            System.out.println("The first disc has been added");
        } else if (quantityOrdered == 2) {
            System.out.println("The second disc has been added");
        } else {
            System.out.println("The disc has been added");
        }
    }

    // Add multiple discs (array)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        int N = dvdList.length;
        if (quantityOrdered + N > MAX_NUMBERS_ORDERED) {
            System.out.println("Too many discs. Cannot add the series.");
            return;
        }

        for (DigitalVideoDisc disc : dvdList) {
            itemsOrdered[quantityOrdered] = disc;
            quantityOrdered++;
        }

        System.out.println("A series of disc was added");
    }

    // Add two discs
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (quantityOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full. Cannot add more items.");
            return;
        }

        // Add the first disc
        if (quantityOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[quantityOrdered] = dvd1;
            quantityOrdered++;
            System.out.println("The first disc of the pair has been added.");
        } else {
            System.out.println("Cannot add the first disc. The cart is full.");
        }

        // Add the second disc
        if (quantityOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[quantityOrdered] = dvd2;
            quantityOrdered++;
            System.out.println("The second disc of the pair has been added.");
        } else {
            System.out.println("Cannot add the second disc. The cart is full.");
        }
    }

    // Calculate total cost
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < quantityOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Get quantity of ordered items
    public int getQuantityOrdered() {
        return quantityOrdered;
    }
}
