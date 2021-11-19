private void highlightTypeError(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element, @org.jetbrains.annotations.NotNull
com.intellij.lang.annotation.AnnotationHolder annotationHolder) {
    annotationHolder.createErrorAnnotation(element, "Strings aren't allowed in types");
}