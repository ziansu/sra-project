private org.gbif.checklistbank.cli.importer.Importer runImport(java.util.UUID datasetKey) throws java.sql.SQLException {
    org.gbif.checklistbank.cli.importer.Importer importer = build(iCfg, datasetKey);
    importer.run();
    return importer;
}