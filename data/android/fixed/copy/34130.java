@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    mCallback.onCheckProfileCompleted(result);
}