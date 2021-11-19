public void done(android.view.View view) {
    android.util.Log.d("AddBook", "done");
    if (addBook()) {
        bm.createBook();
        this.finish();
    }
}