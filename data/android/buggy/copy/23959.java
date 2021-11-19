void removeBook(java.lang.String name) {
    com.botscrew.domain.Book book = getBook(name);
    java.lang.System.out.println((("book " + (book.toString())) + " was removed"));
    bookService.deleteBook(book);
}