private java.lang.Integer getFolderOrderNum(java.lang.String folderName) {
    java.lang.String[] nameToken = folderName.split("_");
    return java.lang.Integer.parseInt(nameToken[0]);
}