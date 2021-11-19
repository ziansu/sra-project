public models.Project getProject() {
    if ((project) == null) {
        models.Project _project = new models.Project();
        _project.setProjectName("Mock");
        _project.setId(java.lang.Long.parseLong("-1"));
        return _project;
    }
    return project;
}