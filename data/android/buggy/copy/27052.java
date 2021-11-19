public double perplexity(java.util.ArrayList<java.lang.String> sentences, int n) {
    return java.lang.Math.pow((1 / (probabilityOfDocument(sentences, n))), (1.0 / n));
}