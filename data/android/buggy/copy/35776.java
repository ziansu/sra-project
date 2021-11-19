public com.lzj.appupdate.UpdateManager config(android.content.Context context, boolean debug, boolean useDefaultDialogDisplay) {
    UpdateConfigs.context = context;
    UpdateConfigs.DEBUG = debug;
    UpdateConfigs.useDefaultDialogDisplay = useDefaultDialogDisplay;
    return com.lzj.appupdate.UpdateManager.getInstance();
}