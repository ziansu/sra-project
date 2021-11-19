public boolean isFloating() {
    if ((isDeadline()) || (isEvent())) {
        return false;
    }else {
        return true;
    }
}