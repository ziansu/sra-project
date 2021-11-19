@java.lang.Override
public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    this.mGametime.startGameTime();
}