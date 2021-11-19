void initialize(java.lang.String propertiesFile) {
    if (propertiesFile != null) {
        ch.puzzle.modjprof.AgentProperties properties = ch.puzzle.modjprof.PropertiesReader.readPropertiesFile(propertiesFile);
        packagesToInstrument = properties.getPropertyAsSet("packagesToInstrument");
    }
}