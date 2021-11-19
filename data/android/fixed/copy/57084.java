@java.lang.Override
public net.nedkargov.business.domain.ProjectDetailsInterface createProject(net.nedkargov.business.domain.ProjectDetailsInterface project) {
    projectMapper.insertProject(project);
    return project;
}