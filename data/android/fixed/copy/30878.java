public void splitSample(java.lang.String tagger) {
    extraction.Splitter s = new extraction.SplitterNegra(sampleLines, tagger);
    s.split();
}