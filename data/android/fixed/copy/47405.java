@org.jetbrains.annotations.Nullable
@java.lang.Override
public com.intellij.psi.PsiElement findElementForUpdatingParameterInfo(@org.jetbrains.annotations.NotNull
com.intellij.lang.parameterInfo.UpdateParameterInfoContext context) {
    return context.getFile().findElementAt(context.getOffset()).getParent().getParent();
}