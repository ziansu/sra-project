@java.lang.Override
public void update(@org.jetbrains.annotations.NotNull
final com.intellij.openapi.actionSystem.AnActionEvent e) {
    final com.intellij.psi.PsiClass psiClass = com.champgm.intellij.plugin.PluginUtil.getPsiClassFromContext(e);
    e.getPresentation().setEnabled((psiClass != null));
}