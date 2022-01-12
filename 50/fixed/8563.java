@java.lang.Override
public boolean addPair(final E domainElem, final E rangeElem) {
    final boolean wasModified = super.addPair(domainElem, rangeElem);
    super.addPair(rangeElem, domainElem);
    return wasModified;
}