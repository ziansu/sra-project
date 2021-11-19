public void updateFile() {
    java.lang.String timeStamp;
    timeStamp = getCurTime();
    writeToFile(timeStamp, programs);
    getOS();
    getRunTime();
}