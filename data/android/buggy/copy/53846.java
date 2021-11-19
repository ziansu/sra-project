@org.neo4j.server.plugins.Description(value = "Add ICD->CCS relations")
@org.neo4j.server.plugins.PluginTarget(value = org.neo4j.graphdb.GraphDatabaseService.class)
public java.lang.String icd10_to_ccs(@org.neo4j.server.plugins.Source
org.neo4j.graphdb.GraphDatabaseService db, @org.neo4j.server.plugins.Description(value = "Input File")
@org.neo4j.server.plugins.Parameter(name = "in_file")
java.lang.String in) throws java.io.IOException {
    org.eihg.phevor.plugins.ICDtoCCS.logger.info(("In: " + in));
    org.eihg.phevor.plugins.ICDtoCCS._icd10_to_ccs(db, in);
    return "complete";
}