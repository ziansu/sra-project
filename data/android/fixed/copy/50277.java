private void fireAssignmentsChanged() {
    if (areEventsEnabled) {
        myManager.fireAssignmentsChanged(this);
    }
}