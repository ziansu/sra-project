private void newPAssError() {
    android.widget.Toast.makeText(getBaseContext(), "New passwords don't match!", Toast.LENGTH_SHORT).show();
    changeDocFirebase.removeEventListener(changeDocListener);
}