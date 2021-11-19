@org.junit.Test
public void shouldExecuteFromMethodsWorking() {
    java.util.List<cn.jimmyshi.beanquery.example.Book> sortedBooks = selectBean(cn.jimmyshi.beanquery.example.Book.class).orderBy("name").desc().executeFrom(mainData);
    dataLoader.assertDataToJsonEqualsExpectedFileContent("shouldBooksShortedByName.json", sortedBooks);
}