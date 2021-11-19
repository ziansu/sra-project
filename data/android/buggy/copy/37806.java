public java.util.List<com.blackducksoftware.integration.hub.model.view.ProjectVersionView> getProjectVersionsByProject(final com.blackducksoftware.integration.hub.model.view.ProjectView project) throws com.blackducksoftware.integration.exception.IntegrationException {
    final com.blackducksoftware.integration.hub.api.project.version.ProjectVersionRequestService projectVersionRequestService = hubServicesFactory.createProjectVersionRequestService(hubServicesFactory.getRestConnection().logger);
    return projectVersionRequestService.getAllProjectVersions(project);
}