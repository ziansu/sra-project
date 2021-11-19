public void setTimeString(java.lang.String st) {
    this.time = st;
    if ((this.timeStand) != null) {
        this.timeStand.setCustomName(time);
    }
}