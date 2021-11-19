public static boolean isEnabled(@org.jetbrains.annotations.Nullable
com.intellij.psi.PsiElement element) {
    return (element != null) && (de.vette.idea.neos.NeosProjectComponent.isEnabled(element.getProject()));
}