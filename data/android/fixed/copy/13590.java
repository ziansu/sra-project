protected java.lang.Exception doInBackground(java.lang.Void... params) {
    try {
        apiHandler.createUser(username, password);
        return null;
    } catch (com.pinomg.determinator.net.ApiErrorException e) {
        return e;
    }
}