public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, double value) {
    if (fieldName != null) {
        style.appendFieldName(sb, fieldName);
        style.appendValue(sb, value);
        style.appendFieldDelimiter(sb);
    }
}