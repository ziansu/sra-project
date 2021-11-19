@java.lang.Override
public void onResourceReady(java.io.File resource, com.bumptech.glide.request.animation.GlideAnimation<? super java.io.File> glideAnimation) {
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeFile(resource.getAbsolutePath());
    addSticker(bitmap);
    addSticker(bitmap);
    addSticker(bitmap);
}