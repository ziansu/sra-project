public void openEditorForNewNote(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.plainolnotes.EditorActivity.class);
    startActivityForResult(intent, com.example.plainolnotes.MainActivity.EDITOR_REQUEST_CODE);
}