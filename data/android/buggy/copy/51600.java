private boolean isIdentityEdit(org.eclipse.xtext.formatting2.regionaccess.ITextReplacement repl) {
    return repl.getReplacementText().equals(repl.getText());
}