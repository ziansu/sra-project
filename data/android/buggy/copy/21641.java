@java.lang.Override
public int addTest(model.Module module, model.Test test) throws java.sql.SQLException {
    return moduleDao.addTest(module, test);
}