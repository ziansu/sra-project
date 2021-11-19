public java.util.List<askme.SolutionEntity> getSolutionList(int classId, int exerciseId) {
    solutionList = solutionSessionBean.getSolutions();
    return solutionList;
}