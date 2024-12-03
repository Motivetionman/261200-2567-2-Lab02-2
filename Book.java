public class Book{
    private String title;
    private String author;
    private double price;

public   Book() {
    this.title = "Unknown";
    this.author = "Unknown";
    this.price = 0.0;
  } 
  public  Book(String title,String author,double price) {

    this.title = title;
    this.author= author;
    this.price = price;
    
  }
  public void displayDetails() {
    System.out.println("Title: " + title);
    System.out.println("Author:" + author);
    System.out.println("Price" + price);
    
  }
  public void updatePrice(double newPrice) {
    price = newPrice;
    if (newPrice >= 0) {
        price = newPrice;
      } else {
        System.out.println("Error: Price cannot be negative.");
      }
  }
  public void applyDiscount(double discountPercentage){
    if (discountPercentage > 0.0 && discountPercentage < 100.0) {
      double discountAmount = (discountPercentage / 100.0) * price;
      price -= discountAmount;
      System.out.printf("Discount of %.2f%% applied. New price: %.2f\n", discountPercentage, price);
    } else {
      System.out.println("Error: Discount percentage must be greater than 0 and less than 100.");
    }

  }

  public static void main(String[] a)
  {
  Book unknownBook = new Book();
  unknownBook.displayDetails();

  Book hp1Book = new Book("Sword art online", "Reki kawahara", -350.00);
  hp1Book.displayDetails();

  hp1Book.updatePrice(32000.00);
  hp1Book.displayDetails();

  
  hp1Book.applyDiscount(-20.00); // Invalid
  hp1Book.applyDiscount(0.00);  // Invalid
  hp1Book.applyDiscount(0.50);  // Valid
  hp1Book.applyDiscount(25.00); // Valid
  hp1Book.applyDiscount(50.00); // Valid
  hp1Book.applyDiscount(100.00); // Invalid
  hp1Book.applyDiscount(150.00); // Invalid


  }
}
