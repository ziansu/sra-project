private void loadSticker() {
    android.graphics.drawable.Drawable drawable = android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.haizewang_215);
    com.xiaopo.flying.sticker.DrawableSticker sticker = new com.xiaopo.flying.sticker.DrawableSticker(drawable, 0.3F);
    stickerView.addSticker(sticker, 0.5F, 0.8F);
}