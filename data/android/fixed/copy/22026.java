public void retrieveFiles(java.lang.String localPath, java.lang.String remotePath) throws java.lang.Exception {
    java.lang.String filesToBeGet = getParameter("RETRIEVE_FILES");
    if (filesToBeGet != null)
        retrieveFiles(filesToBeGet.split(";"), localPath, remotePath);
    
}