@java.lang.Override
public void onStart() {
    super.onStart();
    startIntro();
    startInit();
    startSyncing();
    checkDataState();
}