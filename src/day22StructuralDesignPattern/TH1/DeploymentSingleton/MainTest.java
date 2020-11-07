package day22StructuralDesignPattern.TH1.DeploymentSingleton;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.brrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.geAuthorAndTile());

        bookBorrower2.brrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.geAuthorAndTile());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.geAuthorAndTile());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
