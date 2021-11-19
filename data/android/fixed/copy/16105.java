public static void initializeEntities(java.lang.Object entity, java.lang.String... properties) {
    if (properties == null) {
        return ;
    }
    for (java.lang.String props : properties) {
        com.streetstat.dao.util.HibernateInitializer.recursiveInitializeEntities(entity, props.split("\\."), 0);
    }
}