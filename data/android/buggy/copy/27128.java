public void suspend() {
    for (int i = 0; i < (com.malmstein.fenster.view.FensterDualVideoView.N); ++i) {
        release(false);
    }
}