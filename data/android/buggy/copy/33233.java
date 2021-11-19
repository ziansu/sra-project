@java.lang.Override
public void onBitmapCropped(@android.support.annotation.NonNull
android.net.Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight) {
    setResultUri(resultUri, mGestureCropImageView.getTargetAspectRatio(), offsetX, offsetY, imageWidth, imageHeight);
    finish();
    setupImagePositionOnHidePositive();
}