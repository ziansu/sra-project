public java.lang.String getHostExecutionFlags() {
    return java.lang.String.format("-Xnorelocate -Ximage:%s", getHostCoreImagePath(false));
}