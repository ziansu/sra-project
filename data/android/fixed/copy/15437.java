@java.lang.SuppressWarnings(value = "unchecked")
public void setDecks(java.util.List<com.blstream.studybox.model.database.Deck> data) {
    java.util.Collections.sort(data);
    decksList = ((java.util.List) (data));
    notifyDataSetChanged();
}