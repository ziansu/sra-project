public void setParentCategory(model.Category parentCategory) {
    if (parentCategory != null) {
        model.Category.checkDiffParentCategory(this.description, parentCategory);
    }
    this.parentCategory = parentCategory;
}