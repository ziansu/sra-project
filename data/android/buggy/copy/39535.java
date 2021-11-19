private void createUIComponents() {
    runnerClassName = new com.intellij.openapi.ui.LabeledComponent<com.intellij.openapi.ui.ComponentWithBrowseButton>();
    runnerClassName.setComponent(new com.intellij.openapi.ui.TextFieldWithBrowseButton());
}