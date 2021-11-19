public java.lang.String createWorkspace(java.lang.String name) {
    fr.irisa.diverse.Core.Workspace newWorkspace = new fr.irisa.diverse.Core.Workspace(name, null);
    workspaces.put(newWorkspace.uuid, newWorkspace);
    return newWorkspace.uuid;
}