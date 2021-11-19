private boolean isChoosenForReassignation(org.zkoss.ganttz.data.Task each) {
    return (!(each.isUpdatedFromTimesheets())) && (((type) == (Type.ALL)) || (isAfterDate(each)));
}