@java.lang.Override
public void onSuccess(android.graphics.Bitmap image) {
    ((android.widget.ImageView) (view.findViewById(R.id.addImg))).setImageBitmap(image);
    oldImageBitmap = image;
}