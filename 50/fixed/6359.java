private void startNewNote() {
    android.content.Intent intent = new android.content.Intent(this, app.band.runawaynation.matth.plainnotes.EditorActivity.class);
    startActivityForResult(intent, app.band.runawaynation.matth.plainnotes.MainActivity.EDITOR_REQUEST_CODE);
}