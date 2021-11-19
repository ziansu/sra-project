public java.util.List<com.blackducksoftware.integration.hub.model.view.ProjectView> getAllProjects() throws com.blackducksoftware.integration.exception.IntegrationException {
    final com.blackducksoftware.integration.hub.api.project.ProjectRequestService projectRequestService = hubServicesFactory.createProjectRequestService();
    return projectRequestService.getAllProjects();
}