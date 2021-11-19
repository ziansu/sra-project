public void updateTimeStamp() {
    timeStamp = file.lastModified();
    if ((timeStamp) == 0L) {
        notifyFileRemoved();
    }
    fileSize = file.length();
    copy();
}