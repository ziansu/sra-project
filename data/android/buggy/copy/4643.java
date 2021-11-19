@java.lang.Override
public void onResume() {
    super.onResume();
    if (com.app.sircle.UI.Activity.BaseActivity.jumpToFragment) {
        getActivity().finish();
    }
    com.app.sircle.UI.Fragment.CameraFragment.imageData = null;
    toggleFlashButtonVisibility(View.VISIBLE);
    showBackCamera();
    enableButtons(true);
}