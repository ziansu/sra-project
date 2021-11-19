private void deleteAndWaitProjectNotExistByApi(java.lang.String projectName) throws java.lang.Exception {
    projectServiceClient.deleteResource(projectName, testWorkspace.getName());
    projectExplorer.waitItemIsNotPresentVisibleArea(projectName);
    events.waitExpectedMessage(java.lang.String.format("Project '%s' is removed", projectName));
}