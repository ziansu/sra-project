public void renameFolder(cz.cvut.fel.integracniportal.model.Folder folder, java.lang.String newName) {
    fileRepository.renameFolder(newName, mapFolder(folder, null));
}