public void moveFolder(cz.cvut.fel.integracniportal.model.Folder folder, cz.cvut.fel.integracniportal.model.Folder parent) {
    fileRepository.moveFolder(mapFolder(folder, null), mapFolder(parent, null));
}