public com.pikatimer.results.OutputPortal outputDestination() {
    return com.pikatimer.results.ResultsDAO.getInstance().getOutputPortalByID(outputDestinationID);
}