@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    if (null != (mEditParamsText)) {
        mEditParamsText.setText(subitJson);
    }
    mPostRtrTx.setText(postRTR);
    mPostDetailsRtrTx.setText(postDetailRTR);
}