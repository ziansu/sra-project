public synchronized nz.org.nesi.common.db.project.pojo.ProjectWrapper getProjectWrapperByProjectCode(final java.lang.String projectCode) throws java.lang.Exception {
    final nz.org.nesi.common.db.project.pojo.Project p = getProjectByProjectCode(projectCode);
    return getProjectWrapperById(p.getId());
}