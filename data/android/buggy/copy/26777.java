public main.GenericEvent.Status checkStatusParameter(main.GenericEvent.Status original) {
    if (selectedParameters.getStatus().equals(Status.INCOMPLETE)) {
        return selectedParameters.getStatus();
    }
    return original;
}