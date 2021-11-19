@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    android.util.Log.e("inside do PostExecute", ("before if" + (trails.get(i).getDownlImage())));
    picture.setImageBitmap(trails.get(i).getDownlImage());
}