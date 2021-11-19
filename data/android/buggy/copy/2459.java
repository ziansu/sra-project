public static org.spideruci.tacoco.db.DBUtil getInstance(java.lang.String dbFile) {
    if ((org.spideruci.tacoco.db.DBUtil.instance) != null)
        return org.spideruci.tacoco.db.DBUtil.instance;
    
    org.spideruci.tacoco.db.DBUtil.instance = new org.spideruci.tacoco.db.DBUtil(dbFile);
    return org.spideruci.tacoco.db.DBUtil.instance;
}