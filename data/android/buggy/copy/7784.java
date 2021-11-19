private void doCreate() {
    mId = ntut.csie.ezScrum.dao.ProjectDAO.getInstance().create(this);
    try {
        reload();
    } catch (java.lang.Exception e) {
    }
}