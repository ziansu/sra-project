public boolean containsContext(int[] context) {
    if ((context.length) == 0)
        return true;
    else
        return allContextsSet.contains(new edu.berkeley.cs.nlp.ocular.lm.LongArrWrapper(edu.berkeley.cs.nlp.ocular.lm.LongNgram.convertToLong(context)));
    
}