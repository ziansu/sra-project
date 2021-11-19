public void delete(com.development.vvoitsekh.favoritequotes.data.model.Quote quote) {
    int index = mQuotes.indexOf(quote);
    mQuotes.remove(quote);
}