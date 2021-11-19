@java.lang.Override
protected void onStart() {
    super.onStart();
    for (int i = 0; i < (nFragment); i++) {
        audioPlayer[i].onActivityStarted();
    }
}