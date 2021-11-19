@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.MaterialDialog materialDialog, @android.support.annotation.NonNull
com.spilgames.spilsdk.utils.permissions.dialog.internal.DialogAction dialogAction) {
    com.spilgames.spilsdk.SpilSdk.getInstance(context).getSocialCallbacks().RequestLogin();
    materialDialog.dismiss();
}