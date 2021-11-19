@java.lang.Override
public int init(final int theOffset) {
    int len = (rows) * (columns);
    initHelper(theOffset, len);
    return theOffset + len;
}