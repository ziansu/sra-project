@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    mFileContents = downloadXMLFile(params[0]);
    if ((mFileContents) == null) {
        android.util.Log.d("DownloadData", "Error downloading");
    }
    return mFileContents;
}