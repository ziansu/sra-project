public void setUser(myattendance.BE.User user) {
    this.user = user;
    updateView();
    attendenceChecks();
}