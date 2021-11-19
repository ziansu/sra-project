@lombok.SneakyThrows
private boolean isToscaFile(java.nio.file.Path path) {
    if (isYamlFile(path.getFileName())) {
        if (alien4cloud.csar.services.CsarFinderService.ToscaFinderWalker.readFirstLine(path).startsWith("tosca_definitions_version")) {
            return true;
        }
    }
    return false;
}