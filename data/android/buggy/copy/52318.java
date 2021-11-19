@java.lang.Override
protected void beforeHookedMethod(tk.wasdennnoch.scoop.MethodHookParam param) throws java.lang.Throwable {
    hookUncaughtException(param.args[0].getClass());
}