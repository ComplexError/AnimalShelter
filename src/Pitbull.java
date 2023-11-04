public class Pitbull extends Dog {
    private final String breed;
    public Pitbull(String name, String description, double price) {
        super (name, description, price);
        this.breed = "Pitbull";
    }
    @Override
    public String getBreed() {
        return this.breed;
    }
}