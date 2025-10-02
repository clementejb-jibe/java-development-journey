package librarySystem.library;

public class Library implements LibraryFunctions{
    Book books;
    Member member;

    public Library(Book books, Member member){
        this.member = member;
        this.books = books;

    }

    @Override
    public String borrowBook(){
        return this.member.getName() + " borrowed the " +
                this.books.getTitle() + " \nby " + this.books.getAuthor();
    }

    @Override
    public String returnBook() {
        return this.member.getName() + " returned the book " +
                this.books.getTitle() + " \nby " + this.books.getAuthor();
    }
}
