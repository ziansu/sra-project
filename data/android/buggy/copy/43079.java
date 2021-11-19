private boolean isChoosenForReassignation(org.zkoss.ganttz.data.Task each) {
    if (each.isUpdatedFromTimesheets()) {
        return false;
    }
    return ((type) == (Type.ALL)) || (isAfterDate(each));
}