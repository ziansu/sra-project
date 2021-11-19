public java.lang.String getCategory() {
    if ((hintCategory) != null) {
        if ((hintCategory.getId()) != 1) {
            category = hintCategory.getTitle();
        }else {
            hintCategory = null;
        }
    }
    return category;
}