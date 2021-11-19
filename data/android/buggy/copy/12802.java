public boolean addProject(com.example.beer.model.Project project) {
    com.example.beer.model.Project foundProject = findProjectByName(project.getName());
    if (foundProject != null) {
        em.persist(project);
        return true;
    }else {
        return false;
    }
}