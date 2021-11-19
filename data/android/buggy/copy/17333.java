@java.lang.Override
public int addTests(model.Module module, java.util.Set<model.Test> tests) throws java.sql.SQLException {
    return moduleDao.addTests(module, tests);
}