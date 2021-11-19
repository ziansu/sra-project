public static void dropAllTables(org.greenrobot.greendao.database.Database db, boolean ifExists) {
    com.softdesign.devintensive.data.storage.models.UserDao.dropTable(db, ifExists);
    com.softdesign.devintensive.data.storage.models.RepositoryDao.dropTable(db, ifExists);
}