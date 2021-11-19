@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new io.jchat.android.JMessageReactPackage(com.sample.application.MainApplication.SHUTDOWN_TOAST), new com.honaf.dialog.MyDialogPackage(), new com.horcrux.svg.SvgPackage(), new com.sample.application.ReactIMUIPackage());
}