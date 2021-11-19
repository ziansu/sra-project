@org.jetbrains.annotations.Nullable
@java.lang.Override
public java.util.stream.Stream<com.twitter.intellij.pants.model.PantsTargetAddress> getTargets(com.intellij.openapi.actionSystem.AnActionEvent e, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    return myTargetAddresses.stream().map(PantsTargetAddress::fromString);
}