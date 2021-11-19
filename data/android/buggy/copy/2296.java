@java.lang.Override
public it.uniroma3.mat.extendedset.intset.IntIterator clone() {
    it.uniroma3.mat.extendedset.intset.ConciseSet.BitIterator retVal = new it.uniroma3.mat.extendedset.intset.ConciseSet.BitIterator();
    retVal.exp = exp;
    retVal.nextIndex = nextIndex;
    retVal.nextOffset = nextOffset;
    return retVal;
}