protected void onChangeAvatar(android.view.View view) {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(i, 1);
}