public final java.util.List<java.lang.String> getCategories() {
    if ((this.categories) == null) {
        this.categories = java.util.Collections.unmodifiableList(edu.cmu.tetrad.data.DiscreteVariable.getStoredCategoryList(this.categoriesCopy));
    }
    return this.categories;
}