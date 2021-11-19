@java.lang.Override
protected void onStart() {
    super.onStart();
    com.chalmers.tda367.localfeud.net.ServerComm.updatePostFeed(postAdapter);
}