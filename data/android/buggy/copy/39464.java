@java.lang.Override
public java.util.List<java.lang.String> getCategories() {
    updateLocalCache();
    return localClient.getCategories();
}