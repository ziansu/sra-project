public java.util.List<java.io.File> getEmlFiles() {
    if ((this.emlFiles) == null) {
        this.emlFiles = new netspy.components.filehandling.manager.FileManager().getFilesByExtension(netspy.components.mailing.EmailHandler.EML_FILE_EXTENSION);
    }
    return this.emlFiles;
}