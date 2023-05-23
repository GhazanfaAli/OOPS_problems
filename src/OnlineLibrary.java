class OnlineLibrary {
    String[] books;
    int num_book;

    OnlineLibrary(){
        this.books = new String[100];
        this.num_book = 0;
    }
    void addBook(String title){
        this.books[num_book] = title;
        num_book++;
        System.out.println("book has been added : "+title);
    }
    void showBooks(){
        System.out.println("books are available: ");
        for (int i = 0; i<books.length; i++){
            if(books[i] == null){
                continue;
            }
            System.out.print(books[i]+", ");
        }
    }
    void issueBook(String check){
        for (int i = 0; i<books.length; i++){
            if(books[i] == check){
                System.out.println("book has been issued : "+check);
                break;
            }
            else{
                System.out.println("book not found");
                break;
            }
        }
    }
    void returnBook(String Return){
        addBook(Return);
    }
    public static void main(String args[]){
        OnlineLibrary ob1 = new OnlineLibrary();
        ob1.addBook("maths");
        ob1.addBook("computer");
        ob1.addBook("physics");
        ob1.addBook("JAVA");
        System.out.println();
        ob1.showBooks();
        System.out.println();
        ob1.issueBook("maths");
        System.out.println();
        ob1.returnBook("computer");
    }
}
