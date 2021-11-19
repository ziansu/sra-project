@java.lang.Override
public void onLoadingComplete(java.lang.String imageUri, android.view.View view, android.graphics.Bitmap loadedImage) {
    pic.setImageBitmap(loadedImage);
    pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
    fridgeView.findViewById(R.id.progress_load).setVisibility(View.GONE);
    pic.setVisibility(View.VISIBLE);
}