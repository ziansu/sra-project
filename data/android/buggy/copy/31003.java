public boolean setMonth(int month) {
    if ((month < 1) || (month > 12)) {
        return false;
    }
    this.month = month;
    return true;
}