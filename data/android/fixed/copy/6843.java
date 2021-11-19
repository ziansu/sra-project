@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 100) {
        if (resultCode == (RESULT_OK)) {
            iv_takeImage.setImageURI(file);
        }
    }
}