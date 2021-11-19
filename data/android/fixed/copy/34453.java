public synchronized nz.org.nesi.common.db.project.pojo.ProjectWrapper getProjectWrapperByProjectCode(final java.lang.String projectCode) throws java.lang.Exception {
    nz.org.nesi.common.db.project.pojo.Project p = getProjectByProjectCode(projectCode);
    if (p != null) {
        return getProjectWrapperById(p.getId());
    }else {
        return new nz.org.nesi.common.db.project.pojo.ProjectWrapper();
    }
}