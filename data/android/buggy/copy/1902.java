@org.junit.Test
public void shouldBooksShortedByNameDesc() {
    java.util.List<cn.jimmyshi.beanquery.example.Book> sortedBooks = selectBean(cn.jimmyshi.beanquery.example.Book.class).from(mainData).orderBy("name").desc().execute();
    dataLoader.assertDataToJsonEqualsExpectedFileContent("shouldBooksShortedByName.json", sortedBooks);
}