private boolean isFresh(java.io.File output, com.filmon.maven.Image imageDefinition) {
    return (output.exists()) && (!(processingChain.isInQueue(imageDefinition)));
}