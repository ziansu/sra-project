@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    startService();
    prepareData();
    initAppDataIfNeed();
    return null;
}