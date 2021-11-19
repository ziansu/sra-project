private void startCamera() {
    android.content.Intent intentCamera = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intentCamera, wwckl.projectmiki.activity.MainActivity.REQUEST_TAKE_PICTURE);
}