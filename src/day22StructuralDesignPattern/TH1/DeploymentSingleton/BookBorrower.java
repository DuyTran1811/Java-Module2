package day22StructuralDesignPattern.TH1.DeploymentSingleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void brrowBook(){
        borrowedBook = BookSingleton.brrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    public String geAuthorAndTile(){
        if (haveBook){
            return  borrowedBook.getAuthorTile();
        }
        return "I don't have the book";
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
