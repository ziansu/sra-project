@java.lang.Override
public void onBitmapLoaded(final android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    imageView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.booking.feedon.Utils.DisplayUtil.scaleImage(bitmap, imageView, mContext);
        }
    });
}