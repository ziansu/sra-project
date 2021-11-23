@java.lang.Override
public void onError(int error) {
    android.util.Log.e(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, ("failed to connect/discover: " + error));
    dlg.dismiss();
    if ((getActivity()) != null) {
        getActivity().finish();
    }
}