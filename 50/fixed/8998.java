@java.lang.Override
protected void releaseResources() {
    if (null != (ebean)) {
        ebean.shutdown(false, false);
    }
}