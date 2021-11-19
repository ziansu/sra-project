@java.lang.Deprecated
public void enableDebugLog(boolean enabled, java.lang.String tag) {
    android.util.Log.w(com.google.example.games.basegameutils.GameHelper.TAG, ("GameHelper.enableDebugLog(boolean,String) is deprecated. " + "Use GameHelper.enableDebugLog(boolean)"));
    enableDebugLog(enabled);
}