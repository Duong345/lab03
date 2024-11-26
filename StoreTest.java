public class StoreTest {
    public static void main(String[] args) {
        // Create a Store object
        Store store = new Store();

        // Create some DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Unknown", 90, 18.99f);

        // Test adding DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Display store contents
        System.out.println("\nStore contents after adding DVDs:");
        store.displayStore();

        // Test removing a DVD
        store.removeDVD(dvd2);

        // Display store contents after removal
        System.out.println("\nStore contents after removing 'Star Wars':");
        store.displayStore();

        // Test removing a DVD that doesn't exist
        store.removeDVD(dvd2); // Attempt to remove the same DVD again
    }
}
