public java.lang.String addVideo(java.io.File file, boolean upgradeTo1080) throws com.clickntap.vimeo.VimeoException, java.io.IOException {
    return addVideo(new java.io.FileInputStream(file), upgradeTo1080);
}