private void showDocument(@android.support.annotation.NonNull
android.net.Uri documentUri, @android.support.annotation.Nullable
final java.lang.String password, @android.support.annotation.NonNull
final com.pspdfkit.configuration.activity.PdfActivityConfiguration configuration, @android.support.annotation.NonNull
final org.apache.cordova.CallbackContext callbackContext) {
    showDocumentForUri(documentUri, password, configuration);
    callbackContext.success();
}