@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (result) {
        mainActivity.writeHistory();
        mainActivity.toast(R.string.app_name);
    }else {
        mainActivity.toast(R.string.err_network);
    }
}