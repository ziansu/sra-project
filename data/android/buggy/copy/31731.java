@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mCropImageView.setImageBitmap(null);
    com.comp.iitb.vialogue.library.Storage.recycleBitmap(mCroppedImage);
    sequence.clear();
    sequence = null;
}