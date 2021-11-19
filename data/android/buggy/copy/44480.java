public void error(java.lang.Exception e) {
    this.debug("", StringColor.RED);
    e.printStackTrace();
    this.reset();
}