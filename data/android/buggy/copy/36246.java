public static void i(java.lang.String message) {
    for (int i = 0; i < (io.realm.internal.log.RealmLog.LOGGERS.size()); i++) {
        io.realm.internal.log.RealmLog.LOGGERS.get(0).i(message);
    }
}