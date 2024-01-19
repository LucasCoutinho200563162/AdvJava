public class LibraryApp {
    public static void main(String[] args) {
        Book model = retriveBookFromDatabase("Star People", "John Doe", "1111111111111", "Fiction", "2017");

        BookView view = new BookView();

        BookController controller = new BookController(model, view);

        controller.updateView();

        controller.setBookAuthor("Jane Doe");
        controller.setBookGenre("Sci-fi");
        System.out.println("\nBook Details after updating: ");

        controller.updateView();
    }

    private static Book retriveBookFromDatabase(String title, String author, String isbn, String genre, String year){
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        book.setGenre(genre);
        book.setYear(year);
        return book;
    }
}