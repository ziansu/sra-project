public void createFolder(cz.cvut.fel.integracniportal.model.Folder folder) {
    fileRepository.createFolder(mapFolder(folder));
}