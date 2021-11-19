public cz.lidinsky.tools.ToStringBuilder append(java.lang.String fieldName, cz.lidinsky.tools.IToStringBuildable object) {
    if (fieldName != null) {
        style.appendFieldName(sb, fieldName);
        appendValue(object);
        style.appendFieldDelimiter(sb);
    }
    return this;
}