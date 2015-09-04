//this is an a book product
public class Book implements Product{

    private double price;

    public Book(double price) {
        this.price = price;
    }

    @Override
    public double calculateTax() {
        return price;
    }
}
