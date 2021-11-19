private void config() {
    try {
        org.grouplens.lenskit.hello.UserUser.cxn = org.grouplens.lenskit.hello.ConnectionManager.getConnectionPostGresql();
        org.grouplens.lenskit.hello.UserUser.cxn2 = org.grouplens.lenskit.hello.ConnectionManager.getConnectionPostGresql();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    this.datasetType = 1;
}