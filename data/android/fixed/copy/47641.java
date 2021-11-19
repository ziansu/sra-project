private void setUpApplicableProjectToContext() {
    java.util.Set<java.lang.String> applicableProjects = new java.util.HashSet<>();
    applicableProjects.add(org.eclipse.che.ide.command.editor.page.project.ProjectsPageTest.PROJECT_PATH);
    org.mockito.Mockito.when(applicableContext.getApplicableProjects()).thenReturn(applicableProjects);
}