@java.lang.Override
protected void onPostExecute(java.lang.Integer z) {
    com.example.etaspare.stitchcounter.LibraryActivity context = ((com.example.etaspare.stitchcounter.LibraryActivity) (this.mContext));
    context.updateCursor();
}