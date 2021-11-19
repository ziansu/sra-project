public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, boolean value) {
    if (fieldName != null) {
        style.appendFieldName(sb, fieldName);
        style.appendValue(sb, value);
        style.appendFieldDelimiter(sb);
    }
}