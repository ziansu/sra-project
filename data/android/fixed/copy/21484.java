public com.intellij.lang.ASTNode parse(com.intellij.psi.tree.IElementType t, com.intellij.lang.PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
}