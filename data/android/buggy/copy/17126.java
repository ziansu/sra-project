public void setAndStart(java.lang.String originLogForder, java.lang.String zipedLogFilePrex) {
    zipRecordThread.setOriginLogForder(originLogForder);
    zipRecordThread.setZipedLogZipPrex(zipedLogFilePrex);
    zipRecordThread.run();
}