public void startUp() {
    boolean filesExist = checkIfFilesExist();
    if (filesExist == false)
        createDataFiles();
    
    generateCards();
}