@java.lang.Override
public void onBitmapLoaded(final android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom from) {
    com.booking.feedon.Utils.DisplayUtil.scaleImage(bitmap, imageView, mContext);
}