public static java.lang.String formatUserQuestion(java.lang.String sentence) {
    if (sentence != null) {
        sentence = sentence.replaceAll("[\\pP\u2018\u2019\u201c\u201d]", ",").trim();
    }
    return sentence;
}