@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    try {
        finalResponse.body().close();
    } catch (java.lang.IllegalStateException e) {
    }
    return null;
}