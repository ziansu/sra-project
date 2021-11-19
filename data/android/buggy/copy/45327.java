public void setCheckedIn(java.lang.Boolean checkedIn) {
    this.checkedIn = checkedIn;
    if (checkedIn) {
        checkInTime = new java.util.Date();
    }else {
        checkInTime = null;
    }
}