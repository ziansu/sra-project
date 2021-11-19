private boolean idleTime() {
    if ((idletimer) <= 0) {
        idletimer = getIdleTimer();
        return true;
    }else {
        idletimer = (idletimer) - 1;
        return false;
    }
}