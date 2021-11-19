public byte[] readFile(com.felhr.usbmassstorageforandroid.filesystems.VFSFile file) {
    byte[] data = fatHandler.readFile(file.getFileName());
    return data;
}