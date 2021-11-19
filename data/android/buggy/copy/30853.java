@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bitmap) {
    super.onPostExecute(bitmap);
    imageView.setImageBitmap(bitmap);
    android.util.Log.d("ImageLoader: ", "onPostExecute");
}