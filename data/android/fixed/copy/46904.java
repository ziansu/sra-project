@android.support.annotation.NonNull
private com.novoda.pianohero.RoundViewModel createViewModel(com.novoda.pianohero.Sequence updatedSequence) {
    int nextNotesPosition = updatedSequence.position();
    java.util.List<java.lang.String> notations = getNotations(nextNotesPosition);
    java.lang.String statusMessage = getStatusMessage(updatedSequence);
    return new com.novoda.pianohero.RoundViewModel(notations, statusMessage);
}