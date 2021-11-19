public java.util.List<de.fau.cs.mad.wanthavers.common.Category> getSubcategories(long categoryId) {
    return categoryEndpoint.getSub(categoryId, false);
}