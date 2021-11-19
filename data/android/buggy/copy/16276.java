@java.lang.Override
public void onFinish(java.lang.String response) {
    com.example.tinyboat.Utility.handleBookItemsResponse(bookDB, response);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            closeProgressDialog();
        }
    });
}