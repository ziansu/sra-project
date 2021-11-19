public static java.util.List<com.quollwriter.text.Word> getAsWords(java.lang.String l) {
    return new com.quollwriter.text.Sentence(l, new com.quollwriter.text.DialogueInd()).getWords();
}