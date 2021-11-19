public boolean isPerformClick() {
    if (!(isPerformClick)) {
        isPerformClick = true;
        return false;
    }else {
        return !(isRunning);
    }
}