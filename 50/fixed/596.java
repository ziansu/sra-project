public synchronized void countMessage(int bytesNum) {
    totalBytes += bytesNum;
    java.lang.System.out.println((("current bytes " + ((totalBytes) / (1024 * 1024))) + " MB"));
}