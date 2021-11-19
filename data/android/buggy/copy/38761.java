public static void log(java.lang.String packageName, java.lang.String msg) {
    if (tw.fatminmin.xposed.minminguard.blocker.Util.pref.getBoolean((packageName + "_log"), false)) {
        de.robv.android.xposed.XposedBridge.log(msg);
        android.util.Log.d(tw.fatminmin.xposed.minminguard.blocker.Util.TAG, msg);
    }
}