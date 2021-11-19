@java.lang.Override
protected void onPostExecute(java.lang.Boolean sourceIsHLS) {
    java.lang.String uriString = org.oucho.radio2.PlayerService.url;
    prepareExoPLayer(sourceIsHLS, uriString);
    mExoPlayer.addListener(this);
}