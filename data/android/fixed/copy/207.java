@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intent, REQUEST_CODE_PHOTO);
}