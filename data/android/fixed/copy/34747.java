private boolean rotationThresholdExceeded() {
    return ((fileSystem.fileExists(outputFile)) && ((rotationThresholdBytes) > 0)) && ((fileSystem.getFileSize(outputFile)) >= (rotationThresholdBytes));
}