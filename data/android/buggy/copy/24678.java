public static java.util.List<edu.stanford.nlp.ling.CoreLabel> lemmatize(java.lang.String text) {
    java.util.List<edu.stanford.nlp.ling.CoreLabel> lemmas = org.toradocu.translator.StanfordParser.LEXICALIZED_PARSER.lemmatize(text);
    return lemmas;
}