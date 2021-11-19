private static java.lang.String escape(java.lang.String text) {
    text = text.replaceAll("<", "&lt;");
    text = text.replaceAll(">", "&gt;");
    return text;
}