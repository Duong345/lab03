public class TestPassingParameter {

    public static void main(String[] args) {
        // Create DVD objects
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", null, null, 0, 0);
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella", null, null, 0, 0);

        // Attempt to swap DVDs
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Change title of jungleDVD
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        // This swap won't affect the original objects outside this method
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle, oldTitle, oldTitle, 0, 0);
        // This will only change the title of dvd inside this method scope
    }
}
