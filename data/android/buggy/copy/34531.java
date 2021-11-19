@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    mProgressDialog.hide();
    getActivity().setRequestedOrientation(mOldOrientation);
    doMasterClear();
}