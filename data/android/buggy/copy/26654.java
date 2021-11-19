@java.lang.Override
public jetbrains.mps.idea.core.projectView.edit.SNodeDeleteProvider create(java.util.Collection<org.jetbrains.mps.openapi.model.SNodeReference> selectedNodes, @org.jetbrains.annotations.NotNull
org.jetbrains.mps.openapi.model.EditableSModel modelDescriptor, org.jetbrains.mps.openapi.model.SModel sModel, @org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project) {
    return new jetbrains.mps.idea.core.projectView.edit.SNodeDeleteProvider(selectedNodes, modelDescriptor, project);
}