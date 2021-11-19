@java.lang.Override
public void onSuccess() {
    android.util.Log.i(nl.dobots.crownstone.gui.control.ControlMainFragment.TAG, "power off success");
    _sbPwm.setProgress(0);
    done();
}