public static void clearDiskCache(final android.content.Context context) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.bumptech.glide.Glide.get(context).clearDiskCache();
        }
    }).start();
}