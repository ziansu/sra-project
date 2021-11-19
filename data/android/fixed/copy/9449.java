@java.lang.Override
public int compare(java.lang.String s1, java.lang.String s2) {
    return java.lang.Double.compare(helper.getValue(s1), helper.getValue(s2));
}