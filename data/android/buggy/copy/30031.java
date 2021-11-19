@java.lang.Override
public void onSuccess(org.deviceconnect.android.deviceplugin.fplug.fplug.FPLUGResponse response) {
    updateText(root, R.id.init_res, getString(R.string.success));
}