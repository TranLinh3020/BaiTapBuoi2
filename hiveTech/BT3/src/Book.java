public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    String email;
    char gender;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty){
        this(name, author, price);
        this.qty = qty;
        }
    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "Book[name="+this.name+","author.toString()+
                ",price="+this.price+",qty="+this.qty;
    }
    public static void main(String[] args) {
        Author author1 = new Author("John", "John123@email.com", 'F');
        Book book = new Book("Hoang tu be",author1, 50, 5);
        System.out.println(book);
    }
}
