@cucumber.api.java.en.When(value = "^search repository on author (.*)$")
public void search_repository_on_author(java.lang.String author) throws java.lang.Throwable {
    java.util.List<com.henrik.card.service.domain.Deck> foundDecks = repository.findByAuthor(author);
}