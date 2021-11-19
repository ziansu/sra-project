@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    loading.dismiss();
    JSON_STRING = s;
    showMyBeacon();
}