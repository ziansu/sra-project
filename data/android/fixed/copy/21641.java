@java.lang.Override
public int addTest(model.Module module, model.Test test) throws java.sql.SQLException {
    return this.moduleDao.addTest(module, test);
}