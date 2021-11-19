@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    riffle.leave(player);
}