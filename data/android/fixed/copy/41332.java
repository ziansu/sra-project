@java.lang.Override
protected java.lang.String buildID() {
    if (null != (indicatorSource.getAddress())) {
        return indicatorSource.getAddress().toLowerCase();
    }else {
        return null;
    }
}