public class JackRussellTerrier extends Dog {
    private final String breed;
    public JackRussellTerrier(String name, String description, double price) {
        super(name, description, price);
        this.breed = "Jack Russell Terrier";
    }
    @Override
    public String getBreed() {
        return this.breed;
    }
}


