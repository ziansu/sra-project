@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    try {
        if (isAdded())
            init(savedInstanceState);
        
    } catch (java.lang.IllegalStateException e) {
        e.printStackTrace();
    }
    return null;
}