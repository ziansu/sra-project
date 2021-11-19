@java.lang.Override
protected boolean getUseDeveloperSupport() {
    return NavigationApplication.instance.isDebug();
}