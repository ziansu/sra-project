public static void e(java.lang.String message) {
    for (int i = 0; i < (io.realm.internal.log.RealmLog.LOGGERS.size()); i++) {
        io.realm.internal.log.RealmLog.LOGGERS.get(i).e(message);
    }
}