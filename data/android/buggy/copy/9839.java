@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Integer... params) {
    try {
        dbService.updateBuildingMap(params[0]);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        remoteError = true;
    }
    return null;
}