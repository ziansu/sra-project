@java.lang.Override
protected void onPostExecute(mobile.paluno.de.palaver.model.Message message) {
    super.onPostExecute(message);
    if (message != null) {
        history.put(friend, message);
        refreshListView();
    }
}