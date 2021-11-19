@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    return -(java.lang.Long.compare(o1.length(), o2.length()));
}