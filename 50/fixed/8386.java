public static void shutdown() {
    model.DBManager.lock.unlock();
}