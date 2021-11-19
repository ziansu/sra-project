@java.lang.Override
public void onSuccess(org.deviceconnect.android.deviceplugin.fplug.fplug.FPLUGResponse response) {
    if ((getActivity()) != null) {
        updateText(root, R.id.init_res, getString(R.string.success));
    }
}