@cucumber.api.java.en.When(value = "^search repository for all decks$")
public void search_repository_for_all_decks() throws java.lang.Throwable {
    java.lang.Iterable<com.henrik.card.service.domain.Deck> decks = repository.findAll();
}