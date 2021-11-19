@java.lang.Override
protected void onPreExecute() {
    if ((listener) != null)
        listener.onUpdateStart();
    
}