public java.lang.String getFolderID(java.lang.String cloudService) {
    java.lang.String folderID = "";
    if (cloudService == "GoogleDrive") {
        folderID = googleDriveController.getFolderID();
    }
    if (cloudService == "Dropbox") {
    }
    return folderID;
}