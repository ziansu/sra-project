static void forget(java.lang.String url) {
    com.dylanvann.fastimage.OkHttpProgressGlideModule.DispatchingProgressListener.LISTENERS.remove(url);
    com.dylanvann.fastimage.OkHttpProgressGlideModule.DispatchingProgressListener.PROGRESSES.remove(url);
}