@org.jetbrains.annotations.Nullable
@java.lang.Override
public java.util.stream.Stream<java.lang.String> getTargets(@org.jetbrains.annotations.NotNull
com.intellij.openapi.actionSystem.AnActionEvent e, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    return myTargetAddresses.stream();
}