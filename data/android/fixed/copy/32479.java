public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, cz.lidinsky.tools.IToStringBuildable object) {
    if (fieldName != null) {
        appendFieldName(fieldName);
        appendValue(object);
        style.appendFieldDelimiter(sb);
    }
    return this;
}