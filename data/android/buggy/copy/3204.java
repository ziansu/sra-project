@java.lang.Override
public java.util.Set<com.adrznej.nutcracker.model.CategoryModel> getUserCategories(java.lang.String userLogin) {
    return this.getUserByLogin(userLogin).getUserCategories();
}