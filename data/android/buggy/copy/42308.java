@java.lang.Override
protected void onStop() {
    if ((com.example.su.notes.MainActivity.cursor) != null)
        com.example.su.notes.MainActivity.cursor.close();
    
    super.onStop();
}