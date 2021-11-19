@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    java.lang.System.out.println(result);
    mCallback.onCheckProfileCompleted(result);
}