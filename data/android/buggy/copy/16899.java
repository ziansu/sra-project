@java.lang.Override
public void done(int totalCount) {
    java.lang.String completionString = appContext.getString(R.string.expansion_unzipping_complete, totalCount);
    getSupervisor().publishProgress(completionString, null);
}