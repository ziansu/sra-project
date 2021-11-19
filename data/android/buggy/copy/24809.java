@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.concentrationgame.MainApplication.mCallbackManager));
}