public java.util.List<com.genesisY.nbGardensCatalogue.entities.Category> getAllCategories() {
    if ((catManager.getAllCategories()) != null) {
        return catManager.getAllCategories();
    }else {
        return null;
    }
}