@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.suta.MainApplication.mCallbackManager), new com.imagepicker.ImagePickerPackage());
}