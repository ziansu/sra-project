@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    fetchDataFromDB();
    if (isUpdate) {
        if ((distribution_code) == null) {
            distribution_code = new java.util.HashMap<>();
        }
    }
    return null;
}