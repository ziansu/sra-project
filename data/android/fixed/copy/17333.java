@java.lang.Override
public int addTests(model.Module module, java.util.Set<model.Test> tests) throws java.sql.SQLException {
    return this.moduleDao.addTests(module, tests);
}