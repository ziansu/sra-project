private void loadSticker() {
    android.graphics.drawable.Drawable drawable = android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.haizewang_215);
    com.xiaopo.flying.sticker.DrawableSticker sticker = new com.xiaopo.flying.sticker.DrawableSticker(drawable, 1.0F, 1.0F);
    stickerView.addSticker(sticker, 1.0F, 1.0F);
}