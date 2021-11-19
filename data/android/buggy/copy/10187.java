public boolean onOptionsItemSelected(android.view.MenuItem item) {
    try {
        c.close();
        finish();
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}