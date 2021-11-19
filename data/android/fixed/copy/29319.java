@java.lang.Override
public java.util.List<java.lang.String> getListOfTitles(java.util.List<info.cukes.Book> bookList) {
    return com.google.common.collect.Lists.transform(bookList, Book::getTitle);
}