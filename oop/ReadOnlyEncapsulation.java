class Book{
    private int bookId = 12345;
    private String bookTitle = "Java The Complete Reference";
    private String bookAuthor = "Herbert Schildt";

    public int getBookId(){
        return bookId;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }
}

class ReadOnlyEncapsulation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setBookId(24680);
        System.out.println("ID     - "+b1.getBookId());
        System.out.println("TITLE  - "+b1.getBookTitle());
        System.out.println("AUTHOR - "+b1.getBookAuthor());
    }    
}
