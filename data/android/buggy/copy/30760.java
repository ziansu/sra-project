@org.junit.BeforeClass
public static void beforeClass() throws java.lang.Exception {
    org.apache.solr.update.processor.UpdateRequestProcessorFactoryTest.SAVED_LEVEL = org.apache.log4j.LogManager.getRootLogger().getLevel();
    org.apache.log4j.LogManager.getRootLogger().setLevel(org.apache.log4j.Level.DEBUG);
    initCore("solrconfig-transformers.xml", "schema.xml");
}