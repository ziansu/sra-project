@retrofit.http.GET(value = "/decks/random/")
void getRandomDeck(@retrofit.http.Query(value = "flashcardsCount")
boolean flashcardCountKey, retrofit.Callback<com.blstream.studybox.model.database.Decks> cb);