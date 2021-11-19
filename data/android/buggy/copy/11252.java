private void start() {
    mIsPause = false;
    com.inz.action.PlayAction.getInstance().setPlayBackProgressByUser(false);
    this.camConnect();
}