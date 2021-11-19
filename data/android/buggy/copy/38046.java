@java.lang.Override
public void onResume() {
    super.onResume();
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    mFrame = ((android.widget.FrameLayout) (findViewById(R.id.fullscreen_camera)));
    Globals.lastImageTaken = null;
    newCamera();
}