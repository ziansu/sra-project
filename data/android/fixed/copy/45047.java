@java.lang.Override
protected void onPostExecute(java.lang.Long totalSize) {
    if (null != (pDialog)) {
        pDialog.dismiss();
    }
    activity.callBackData(myParsedExampleDataSet);
}