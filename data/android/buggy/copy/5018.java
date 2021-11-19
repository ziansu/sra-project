public void handleFeedback(java.io.InputStream in) {
    try {
        fb = CarControlProtos.FeedBack.parseDelimitedFrom(in);
        processFeedback(fb);
    } catch (java.io.IOException e) {
        android.util.Log.d("DEC", "IOException");
        e.printStackTrace();
    }
}