@java.lang.Override
protected java.util.ArrayList<com.android.infosessions.Session> doInBackground(java.lang.String... params) {
    java.util.ArrayList<com.android.infosessions.Session> sessions = com.android.infosessions.QueryUtils.fetchInfos(params[0], getContext());
    insertSession(sessions);
    return sessions;
}