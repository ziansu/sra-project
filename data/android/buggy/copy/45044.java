@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    me.ccrama.redditslide.Authentication.httpAdapter.getNativeClient().connectionPool().evictAll();
    return null;
}