private void stopTimeout() {
    if ((isrunning) && ((timeouttimer) != null)) {
        timeouttimer.cancel();
        timeouttimer = null;
        isrunning = false;
    }
}