@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power on success");
    _sbPwm.setProgress(100);
    done();
}