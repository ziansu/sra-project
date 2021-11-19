@java.lang.Override
public int getInt(long i) {
    java.lang.String s = get(i);
    return ((int) (s != null ? s.length() : 0));
}