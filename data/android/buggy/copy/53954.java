public static void cancelAll() {
    ((com.tangwy.yasync.SmartExecutor) (com.tangwy.yasync.YAsync.mLruExecutor)).clear();
    com.tangwy.yasync.YAsync.mCachedExecutor.shutdown();
}