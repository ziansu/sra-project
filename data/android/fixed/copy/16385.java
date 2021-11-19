private boolean checkMaxJobs(model.Datastore theDatastore) {
    if ((theDatastore.getNumberOfJobs()) == (view.ParkManagerView.TEMP_MAX_JOBS)) {
        java.lang.System.out.println("Max Number of Jobs reached. Please choose a different selection.");
        return true;
    }
    return false;
}