@java.lang.Override
protected void onStart() {
    super.onStart();
    for (int i = 0; i < ((nFragment) - 1); i++) {
        audioPlayer[i].onActivityStarted();
    }
}