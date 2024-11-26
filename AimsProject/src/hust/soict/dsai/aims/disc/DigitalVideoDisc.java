package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int idCounter = 0; // Auto-increment ID generator
    private int id;

    // Constructor with all attributes
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++idCounter;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Constructor with title, category, and cost only
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, "Unknown", 0, cost);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " minutes: " + String.format("%.2f", cost) + " $";
    }

    // Checks if the title matches (case-insensitive and partial match)
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

	public void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}
}
