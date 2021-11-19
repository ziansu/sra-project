@java.lang.Override
public java.util.List<E> subList(int fromIndex, int toIndex) {
    return new org.jtrfp.trcl.coll.ListActionDispatcher<E>(cache, targetsMap, ((startIndex) + fromIndex), ((endIndex) + toIndex));
}