public void removeBook(assignment.Book book) {
    if ((catalogue.remove(book.getIsbn())) == null) {
        java.lang.System.err.println("[ERR] Book not found.");
    }
}