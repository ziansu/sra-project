public void onClick(android.view.View v) {
    android.widget.ImageView image = ((android.widget.ImageView) (findViewById(R.id.editImageView)));
    image.setImageDrawable(null);
    deletePicture.setImageResource(android.R.color.transparent);
    bitmapImage = null;
}