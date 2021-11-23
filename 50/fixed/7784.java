private void doCreate() {
    mId = ntut.csie.ezScrum.dao.ProjectDAO.getInstance().create(this);
    reload();
}