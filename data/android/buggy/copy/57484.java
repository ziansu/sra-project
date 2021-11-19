public void visitElement(org.intellij.sequencer.generator.PsiElement psiElement) {
    org.intellij.sequencer.util.PsiUtil.acceptChildren(psiElement, this);
}