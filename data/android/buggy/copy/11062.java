public java.lang.Boolean doesCategoryExist(java.lang.String categoryName) {
    return (this.getEntityId(ProductContract.CategoryEntity.TABLE_NAME, ProductContract.CategoryEntity.COLUMN_TITLE, categoryName)) >= 0;
}