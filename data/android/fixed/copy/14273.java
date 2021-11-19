private boolean isNextCharEscapeableNameChar() throws org.eclipse.jface.text.BadLocationException {
    return ((offset) < (endOffset)) && (org.jboss.ide.eclipse.freemarker.lang.ParserUtils.isEscapeableNameChar(document.getChar(offset)));
}