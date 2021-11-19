protected void returnSelectedWinery(final long wineryId) {
    android.content.Intent intent = new android.content.Intent(this, com.robcutmore.vinotes.ui.AddNoteActivity.class);
    intent.putExtra("id", wineryId);
    setResult(com.robcutmore.vinotes.ui.RESULT_OK, intent);
    finish();
}