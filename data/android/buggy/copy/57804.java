@java.lang.Override
public edu.umn.biomedicus.framework.store.SpansMap<E> descendingEnd() {
    return new edu.umn.biomedicus.framework.store.ImmutableSpanMap.AscendingReversingView<>(this, 0, java.lang.Integer.MAX_VALUE, 0, ((begins.length) - 1));
}