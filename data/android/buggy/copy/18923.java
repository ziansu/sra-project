@java.lang.Override
public void onSuccess(java.util.List<com.blstream.studybox.model.database.Decks> response) {
    listener.OnDecksReceived(response);
}