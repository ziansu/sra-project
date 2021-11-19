public void handleMessage(android.os.Message msg) {
    if ((msg.what) == 0) {
        try {
            builder.show();
            ScrollingActivity.mAdapter.notifyDataSetChanged();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}