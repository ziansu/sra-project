public void takePhoto(android.view.View view) {
    dispatchTakePictureIntent();
    android.content.Intent intent = new android.content.Intent(this, com.jonathan.simplephoto.PhotoActivity.class);
    startActivity(intent);
}