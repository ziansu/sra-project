@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    this.currentP = savedInstanceState.getInt("CurrentPosition");
}