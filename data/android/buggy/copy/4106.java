private void bindViews() {
    mLayoutRoot = ((android.widget.RelativeLayout) (findViewById(R.id.gv_root)));
    mFragment = ((net.gini.android.vision.camera.CameraFragmentCompat) (getSupportFragmentManager().findFragmentById(R.id.gv_fragment_camera)));
}