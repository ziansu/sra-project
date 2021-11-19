@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    if (success) {
        alPathItems.set(((alPathItems.size()) - 3), fileDst);
    }
}