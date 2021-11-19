@java.lang.Override
public java.util.List<library.service.impl.Book> getAllBookList() {
    java.lang.System.out.println(((libraryPersistentBean) + "libraryPersistentBean-------------------------------"));
    return libraryPersistentBean.getBooks();
}