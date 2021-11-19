@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    for (android.os.AsyncTask task : tasks) {
        task.cancel(true);
    }
    bitmap.recycle();
    bitmap = null;
}