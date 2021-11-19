@java.lang.Override
protected void beforeHookedMethod(tk.wasdennnoch.scoop.MethodHookParam param) throws java.lang.Throwable {
    if ((param.args[0]) != null)
        hookUncaughtException(param.args[0].getClass());
    
}