public boolean containsContext(int[] context) {
    return allContextsSet.contains(new edu.berkeley.cs.nlp.ocular.lm.LongArrWrapper(edu.berkeley.cs.nlp.ocular.lm.LongNgram.convertToLong(context)));
}