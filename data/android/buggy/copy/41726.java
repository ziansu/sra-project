private void extractFile(java.io.File archive, java.io.File destinationDirectory) throws com.github.eirslett.maven.plugins.frontend.lib.ArchiveExtractionException {
    this.logger.info("Unpacking {} into {}", archive, destinationDirectory);
    this.archiveExtractor.extract(archive.getPath(), destinationDirectory.getPath());
}