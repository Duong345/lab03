public class Store {
    public static final int MAX_ITEMS = 50;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0;

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore >= MAX_ITEMS) {
            System.out.println("The store is full. Cannot add more DVDs.");
        } else {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("DVD added to store: " + dvd.toString());
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        int pos = -1;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == dvd) {
                pos = i;
                break;
            }
        }

        if (pos < 0) {
            System.out.println("DVD not found in store: " + dvd.toString());
        } else {
            for (int i = pos; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            qtyInStore--;
            System.out.println("DVD removed from store: " + dvd.toString());
        }
    }

    // Method to display all DVDs in the store
    public void displayStore() {
        System.out.println("********************STORE********************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("********************************************");
    }
}
