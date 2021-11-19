private void addCorpusToTree(de.catma.document.Corpus corpus) {
    corporaTree.addItem(new java.lang.Object[]{ corpus.toString() }, corpus);
    corporaTree.setChildrenAllowed(corpus, false);
}