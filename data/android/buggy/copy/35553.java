@java.lang.Override
protected void restoreState(java.lang.Object[] data) {
    window.restoreState(data);
    window.reSchedule();
}