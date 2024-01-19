public class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view){
        this.model = model;
        this.view = view;
    }

    public void setBookTitle(String title){
        model.setTitle(title);
    }

    public String getBookTitle(){
        return model.getTitle();
    }

    public void setBookAuthor(String author){
        model.setAuthor(author);
    }

    public String getBookAuthor(){
        return model.getAuthor();
    }

    public void setBookIsbn(String isbn){
        model.setIsbn(isbn);
    }

    public String getBookIsbn(){
        return model.getIsbn();
    }

    public void setBookGenre(String genre){
        model.setGenre(genre);
    }

    public String getBookGenre(){
        return model.getGenre();
    }

    public void setBookYear(String year){
        model.setYear(year);
    }

    public String getBookYear(){
        return model.getYear();
    }

    public void updateView(){
        view.printBookDetails(model.getTitle(), model.getAuthor(), model.getIsbn(), model.getGenre(), model.getYear());
    }

}
