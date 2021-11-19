public void setTime(java.lang.String hms) {
    theTimer.stop();
    theTimer.setTime(hms);
    theTimer.start();
}