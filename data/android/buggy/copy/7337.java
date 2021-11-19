public java.util.List<v4.models.Suggestion> checkGrammar(java.lang.String words, java.lang.String pos, java.lang.String lemmas) throws java.io.IOException, java.lang.InterruptedException {
    return checkGrammar(new v4.models.Input(words, pos, lemmas));
}