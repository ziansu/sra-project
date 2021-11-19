@java.lang.Override
public int getColumnNumber(int column) {
    return delegate.getColumnNumber(columnIndices.indexOf(column));
}