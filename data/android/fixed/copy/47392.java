private void cleanup() {
    try {
        zipFile.close();
        zipFile = null;
    } catch (java.io.IOException e) {
    }
    if ((tempZipFileDir) != null) {
        com.bc.ceres.core.VirtualDir.deleteFileTree(tempZipFileDir);
    }
}