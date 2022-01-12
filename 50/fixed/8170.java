public java.util.List<java.lang.String> getSavedData(java.lang.String type) {
    java.util.List<java.lang.String> handwritingList;
    handwritingList = dataBaseHelper.getData(type);
    return handwritingList;
}