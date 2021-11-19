public boolean linkIsDocked() {
    if (isTaken()) {
        return (robotTaking().getDockingStation()) == (this);
    }else {
        return false;
    }
}