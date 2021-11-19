private void append(final java.lang.StringBuilder sb, final java.lang.String val, final boolean prepComma) {
    if (prepComma) {
        sb.append(", ");
    }
    sb.append(val);
}