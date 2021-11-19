private void multipleimageClick() {
    android.util.Log.d(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.TAG, "multipleimageClick");
    multipleImage.setAddClickCallback(new com.goyourfly.multi_picture.MultiPictureView.AddClickCallback() {
        @java.lang.Override
        public void onAddClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            com.example.asus.travelamapdemo.util.MatisseUtil util = new com.example.asus.travelamapdemo.util.MatisseUtil(com.example.asus.travelamapdemo.view.activity.WriteNoteActivity.this, multipleImage);
        }
    });
}