@java.lang.Override
public int getWindowOffset(final long position) {
    return ((int) (position % ((long) (windowBytes.length()))));
}