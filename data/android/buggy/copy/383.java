public void reset() {
    if (!(isLockedIntoCombat())) {
        mayAct = true;
    }else {
        mayAct = false;
    }
    history.clear();
}