public void deleteFiles() throws java.lang.Exception {
    java.lang.String filesToBeDeleted = getParameter("DELETE_FILES");
    if (filesToBeDeleted != null)
        deleteFiles(filesToBeDeleted.split(";"));
    
}