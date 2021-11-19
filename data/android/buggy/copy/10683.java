java.lang.String preprocess(java.lang.String line) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    stripComment(line, 0, builder);
    com.google.common.base.Preconditions.checkArgument((!(inComment)), "unterminated comment.");
    return builder.toString();
}