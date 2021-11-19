public java.util.List<eu.modernmt.context.ContextDocument> getContext(java.io.File source, java.util.Locale lang, int limit) throws eu.modernmt.context.ContextAnalyzerException {
    return getContext(new eu.modernmt.model.impl.FileCorpus(source, eu.modernmt.context.ContextAnalyzer.getNameFromFile(source), lang), limit);
}