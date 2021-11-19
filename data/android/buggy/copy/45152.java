@java.lang.Override
public void onResume() {
    super.onResume();
    frontCamPreview.open();
    backCamPreview.open();
    startPreview();
}