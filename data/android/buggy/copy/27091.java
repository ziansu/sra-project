public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        if (requestCode == 1) {
            android.net.Uri selectedImageUri = data.getData();
        }
    }
}