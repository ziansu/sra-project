@java.lang.Override
public void onResume() {
    super.onResume();
    updateBeatArrayView();
    readPreferences();
    org.puredata.core.PdBase.sendBang("ping_patch_for_info");
}