@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.locon.withu.models.Story> stories) {
    if (stories != null) {
        if ((listener) != null) {
            listener.onStoriesFetched(stories);
            listener = null;
        }
    }
}