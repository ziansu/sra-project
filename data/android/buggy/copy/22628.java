@java.lang.Override
public void onBindViewHolder(com.example.xunhu.xunchat.View.AllAdapters.PhotoGalleryAdapter.ViewHolder holder, int position) {
    android.graphics.Bitmap bitmap = getBitmapFromMediaStore(position);
    if (bitmap != null) {
        holder.getIvPhotoGallery().setImageBitmap(bitmap);
    }
}