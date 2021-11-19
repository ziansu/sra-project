protected void updateStatus(java.lang.String message) {
    setErrorMessage(message);
    setPageComplete((message == null));
}