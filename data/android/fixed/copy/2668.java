@java.lang.Override
public boolean hasNext() {
    return ((this.consumed) < (this.limit)) && (this.iterator.hasNext());
}