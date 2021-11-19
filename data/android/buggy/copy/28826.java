public void setTemporaryImage(android.graphics.Bitmap bitmap) {
    this.img = bitmap.copy(Bitmap.Config.ARGB_8888, true);
    android.util.Log.d("PuzzleAdapter", ("New image has been set " + (imgId)));
}