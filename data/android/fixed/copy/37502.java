@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (REQUEST_PICTURE_RESULT)) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            getAdapter().swap(getFiles());
        }
    }
}