protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (mHelper.handleActivityResult(requestCode, resultCode, data)) {
        return ;
    }
}