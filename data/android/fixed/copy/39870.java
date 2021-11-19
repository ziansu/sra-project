public boolean setId(int id) {
    if ((this.id) != id) {
        this.id = id;
        checkedNotifyObserver();
        return true;
    }
    return false;
}