@java.lang.Override
public void onBitmapCropped(@android.support.annotation.NonNull
android.net.Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight) {
    setupImagePositionOnHidePositive(resultUri, offsetX, offsetY, imageWidth, imageHeight);
    finish();
}