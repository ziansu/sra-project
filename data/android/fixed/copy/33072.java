@java.lang.Override
public void onResume() {
    super.onResume();
    readPreferences();
    org.puredata.core.PdBase.sendBang("ping_patch_for_info");
}