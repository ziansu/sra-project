@java.lang.Override
public java.util.List<library.service.impl.Book> getAllBookList() {
    return libraryPersistentBean.getBooks();
}