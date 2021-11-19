@java.lang.Override
public java.util.List<java.lang.String> getListOfTitles(java.util.List<info.cukes.Book> bookList) {
    java.util.List<java.lang.String> titlesOfBooks = com.google.common.collect.Lists.transform(bookList, Book::getTitle);
    return titlesOfBooks;
}