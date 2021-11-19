public net.didion.jwnl.data.IndexWord getIndexWord(java.lang.String word, java.lang.String pos) {
    try {
        lt.mif.vu.crosscorr.nlp.PartOfSpeech partOfSpeech = lt.mif.vu.crosscorr.nlp.PartOfSpeech.get(pos);
        return getIndexWord(word, partOfSpeech);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}