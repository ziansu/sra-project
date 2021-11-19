@org.jetbrains.annotations.Nullable
@java.lang.Override
protected org.jetbrains.idea.devkit.inspections.PsiClass compute() {
    final java.util.Set<org.jetbrains.idea.devkit.inspections.PsiClass> types = org.jetbrains.idea.devkit.inspections.RegistrationCheckerUtil.getRegistrationTypes(checkedClass, CHECK_ACTIONS);
    return com.intellij.util.containers.ContainerUtil.getFirstItem(types);
}