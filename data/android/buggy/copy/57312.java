private long timeStamp() {
    java.util.Date date = new java.util.Date();
    long time = date.getTime();
    return time / 1000;
}