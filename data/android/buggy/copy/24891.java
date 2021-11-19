public org.intellij.lang.xpath.psi.XPathVariable resolve(final org.intellij.lang.xpath.psi.XPathVariableReference reference) {
    final com.intellij.psi.PsiManager mgr = reference.getManager();
    return ((org.intellij.lang.xpath.psi.XPathVariable) (com.intellij.psi.impl.source.resolve.ResolveCache.getInstance(mgr.getProject()).resolveWithCaching(reference, RESOLVER, true, false)));
}