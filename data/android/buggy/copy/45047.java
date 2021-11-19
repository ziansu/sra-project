@java.lang.Override
protected void onPostExecute(java.lang.Long totalSize) {
    pDialog.dismiss();
    activity.callBackData(myParsedExampleDataSet);
}