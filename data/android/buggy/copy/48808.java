@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (result) {
        mainActivity.setMessage(publicKeyToString());
        mainActivity.writeHistory();
        mainActivity.toast(R.string.successful_connection);
    }else {
        mainActivity.toast(R.string.failed_connection);
    }
}