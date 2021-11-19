public org.iish.hsn.invoer.service.akte.BevolkingsregisterFlowState createNewAkteForCorrection() {
    org.iish.hsn.invoer.service.akte.BevolkingsregisterFlowState bevolkingsregisterFlowState = createNewAkte();
    bevolkingsregisterFlowState.setCorrection(true);
    bevolkingsregisterFlowState.setOneLineEach(false);
    return bevolkingsregisterFlowState;
}