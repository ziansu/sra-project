@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    if ((mException) == null)
        mCallback.onSuccess();
    else
        mCallback.onFail();
    
}