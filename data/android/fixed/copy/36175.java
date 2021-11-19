protected void toggleDebugLog() {
    mDebugLog = !(mDebugLog);
    if ((gameHelper) != null) {
        gameHelper.enableDebugLog(mDebugLog);
    }
}