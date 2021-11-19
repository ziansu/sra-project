@java.lang.Override
protected void beforeHookedMethod(com.woalk.apps.xposed.htcblinkfeedauthorizer.MethodHookParam param) throws java.lang.Throwable {
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.d("X_Mod: Hooking theme crop activity.");
    param.args[4] = false;
    com.woalk.apps.xposed.htcblinkfeedauthorizer.Logger.logHookAfter(param);
}