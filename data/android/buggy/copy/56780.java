public org.work.domain.model.Book getOne(java.lang.Long id) {
    org.work.domain.model.Book book = bookRepository.getOne(id);
    book.getCategoryList().forEach(java.lang.System.out::println);
    return book;
}