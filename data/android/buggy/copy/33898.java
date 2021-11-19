protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    IntegrationInterface.act.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (videoRequestCode)) && (resultCode == (RESULT_OK))) {
        authenticateUser();
    }
}