public static void logout() {
    com.netease.nim.uikit.NimUIKit.clearCache();
    com.example.lovespace.DemoCache.clear();
    com.netease.nim.uikit.LoginSyncDataStatusObserver.getInstance().reset();
}