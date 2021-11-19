private boolean isExist(java.lang.String name) {
    return (sqLiteHandler.getCategory(name.toUpperCase())) != null;
}