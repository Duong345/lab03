public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public Cart() {
        System.out.println("A cart has been created");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (this.qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            this.itemsOrdered[this.qtyOrdered] = dvd;
            this.qtyOrdered++;
            System.out.println("The disc has been added:");
            System.out.println(dvd.toString());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        int pos = -1;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i] == dvd) {
                pos = i;
                break;
            }
        }

        if (pos < 0) {
            System.out.println("No such disc found");
        } else {
            for (int i = pos; i < this.qtyOrdered - 1; i++) {
                this.itemsOrdered[i] = this.itemsOrdered[i + 1];
            }
            this.qtyOrdered--;
        }
    }

    public double totalCost() {
        double result = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            result += this.itemsOrdered[i].getCost();
        }
        return result;
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < this.qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + this.itemsOrdered[i].toString());
        }
        System.out.printf("Total cost: %.2f $%n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i].getId() == id) {
                System.out.println("Match found: " + this.itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrdered[i].isMatch(title)) {
                System.out.println("Match found: " + this.itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title containing: \"" + title + "\"");
        }
    }
}
