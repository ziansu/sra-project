private boolean confirmDelete(java.util.List<org.eclipse.core.resources.IResource> resources) {
    if (containsOnlyProjects(resources)) {
        return confirmDeleteProjects(resources);
    }
    return confirmDeleteNonProjects(resources);
}