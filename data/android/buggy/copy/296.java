public void onStateChanged(int x) {
    java.lang.System.out.println(java.lang.String.format("TestObserver.onStateChange %d", x));
    this.x = x;
}