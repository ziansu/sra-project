public void pipToggle() {
    pip = !(pip);
    if (debug) {
        uic.setFilterToggleVisibility(pip);
    }
}