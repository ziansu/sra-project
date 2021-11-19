public com.group5.bookmanager2.Models.Book createBook() {
    com.group5.bookmanager2.Models.Book book = new com.group5.bookmanager2.Models.Book();
    books.add(book);
    for (com.group5.bookmanager2.Models.BookManager.BookManagerListener listener : listeners)
        listener.bookDataChanged();
    
    saveChanges();
    return book;
}