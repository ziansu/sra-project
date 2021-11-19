public void ChoosePicture(com.myflightbook.android.ActMFBForm.GallerySource gs) {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    i.setType("image/* video/*");
    startActivityForResult(i, com.myflightbook.android.ActMFBForm.SELECT_IMAGE_ACTIVITY_REQUEST_CODE);
}