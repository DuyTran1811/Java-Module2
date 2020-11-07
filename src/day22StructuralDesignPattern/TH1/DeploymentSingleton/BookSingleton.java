package day22StructuralDesignPattern.TH1.DeploymentSingleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoadedOut;

    public BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoadedOut = false;
    }

    public static BookSingleton brrowBook() {
        if (!isLoadedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoadedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookSingleton){
        isLoadedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthorTile(){
        return getTitle()+"By"+getAuthor();
    }
}
