public java.lang.String getCollectorClassName() {
    if (isCsvParserDefined()) {
        return getCsvParser();
    }else {
        org.n52.sos.importer.feeder.Configuration.LOG.error("Collector implementation not defined! Using default: {}", org.n52.sos.importer.feeder.DefaultCsvCollector.class.getName());
        return org.n52.sos.importer.feeder.DefaultCsvCollector.class.getName();
    }
}