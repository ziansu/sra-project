@javax.annotation.Nullable
@java.lang.Override
protected java.lang.String getJSBundleFile() {
    return BuildConfig.DEBUG ? super.getJSBundleFile() : com.microsoft.codepush.react.CodePush.getBundleUrl();
}