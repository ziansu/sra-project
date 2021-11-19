private void createDummyData() {
    createDummyTiles();
    be.willima.jrpgdatabase.model.JRPGProject project = createDummyProject();
    projects.put(project.getProjectFolderURI(), project);
    activeProject = project;
}