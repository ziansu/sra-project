@java.lang.Override
public void update(final com.intellij.openapi.actionSystem.AnActionEvent e) {
    com.intellij.psi.PsiClass psiClass = com.champgm.intellij.plugin.PluginUtil.getPsiClassFromContext(e);
    e.getPresentation().setEnabled((psiClass != null));
}