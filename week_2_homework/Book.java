package week_2_homework;

public class Book implements Borrowable {
    protected String title;
    protected String author;
    protected int isbn;
    protected boolean borrowed;

    Book(String title, String author, int isbn, boolean borrowed){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = borrowed;
    }

    public void borrowBook() {
        this.borrowed = true;
        System.out.println(title + "가 대출 되었습니다.");
    }
    public void returnBook() {
        this.borrowed = false;
        System.out.println(title + "가 반납 되었습니다.");
    }

    public boolean isBorrowed(){
        return this.borrowed;
    }

    public String getTitle(){
        return this.title;
    }

    public int getISBN(){
        return this.isbn;
    }

    @Override
    public String toString(){
        String status = this.borrowed ? "[대출 중]" : "[대출 가능]";
        return status + " \""+this.title+"\" 저자: "+this.author+" (ISBN:"+this.isbn+")";
    }
}
