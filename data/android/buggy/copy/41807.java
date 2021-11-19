private static java.lang.String escape(java.lang.String text) {
    text.replaceAll("<", "&lt;");
    text = text.replaceAll(">", "&gt;");
    return text;
}