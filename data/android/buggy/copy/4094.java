@java.lang.Override
public android.database.Cursor loadInBackground() {
    android.database.Cursor cursor = db.getUserFood();
    try {
        java.util.concurrent.TimeUnit.MILLISECONDS.sleep(1);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return cursor;
}