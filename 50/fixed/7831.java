@java.lang.Override
public void onBackPressed() {
    audioBackground.stop();
    this.finish();
    java.lang.System.exit(0);
}