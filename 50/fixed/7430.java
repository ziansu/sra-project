public static void shutdownExecutor(org.andstatus.app.os.MyAsyncTask.PoolEnum pool) {
    if (pool != (MyAsyncTask.PoolEnum.DEFAULT)) {
        org.andstatus.app.os.AsyncTaskLauncher.getExecutor(pool).shutdown();
    }
}