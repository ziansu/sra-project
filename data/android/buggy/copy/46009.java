@java.lang.Override
protected org.json.JSONObject doInBackground(java.lang.Void... params) {
    try {
        return mContactUtils.listContacts(context);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return null;
    }
}