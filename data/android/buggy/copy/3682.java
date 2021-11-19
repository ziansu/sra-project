@java.lang.Override
protected void performAction(boolean shouldSchedulePassive) {
    assert !shouldSchedulePassive;
    maybeAutoSave();
}