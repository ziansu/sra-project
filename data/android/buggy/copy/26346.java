@java.lang.Override
protected void onPause() {
    super.onPause();
    this.currentP = this.mdP.getCurrentPosition();
}