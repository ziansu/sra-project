private void loadRecommendedPOTab() {
    loadHops();
    loadMalt();
    loadSupplies();
    loadVendors();
    loadYeast();
    loadHopContracts();
    createRecomendedPOArray();
    setRecPOPopupList();
    loadRecPOTree();
}