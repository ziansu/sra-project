public void disassociateTrustBundle() {
    if ((selectedTrustBundle) != null) {
        directService.disassociateTrustBundleFromDomain(selectedDomain.getId(), selectedTrustBundle.getId());
        selectedTrustBundle = null;
    }
}