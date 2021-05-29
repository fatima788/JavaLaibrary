import java.util.Date;
public class Book {

    public int bookId;
    public int price;
    public String author;
    public String name;
    public String rackNo;
    public String status;
    public String edition;
    public Date dateOfPurchase;

    public Book(int bookId, int price, String author,String name,String rackNo, String status,
     String edition, Date dateOfPurchase){
         this.bookId=bookId;
         this.author=author;
         this.price=price;
         this.name=name;
         this.rackNo=rackNo;
         this.status=status;
         this.edition=edition;
         this.dateOfPurchase=dateOfPurchase;

    }

public void displayBookDetail() {
    
}

public void updateStatus() {
    
}
    public static void main(String[] args) {
        
    }
}