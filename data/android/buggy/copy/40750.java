public java.util.List<java.lang.String> trim(java.util.List<java.lang.String> words) throws java.io.FileNotFoundException {
    if ((stopwords) == null)
        stopwords = it.unito.nlplap.semantics.utils.StopWordsTrimmer.loadStopWords(datasetPath);
    
    return it.unito.nlplap.semantics.utils.StopWordsTrimmer.trim(words, datasetPath);
}