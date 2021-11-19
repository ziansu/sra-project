@java.lang.Override
protected java.awt.image.BufferedImage render() {
    return job.getResizedImage(job.getOriginalImage(job.originals.get(fileID)), job.outputDimensions.get(dimID));
}