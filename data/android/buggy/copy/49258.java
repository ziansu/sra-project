public com.pikatimer.results.OutputPortal outputDestination() {
    if ((outputDestination) == null)
        outputDestination = com.pikatimer.results.ResultsDAO.getInstance().getOutputPortalByID(outputDestinationID);
    
    return outputDestination;
}