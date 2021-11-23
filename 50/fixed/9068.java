@org.jetbrains.annotations.Nullable
private com.intellij.openapi.projectRoots.Sdk getCurrentProjectJdk() {
    projectJdksModel.reset(commonModel.getProject());
    return projectJdksModel.getProjectSdk();
}