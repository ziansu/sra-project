@org.junit.After
public void tearDown() {
    test.CycMapperTest.wmi_.clearCachedArticles();
    test.CycMapperTest.mapper_.clearMappings();
    cyc.OntologyConcept.parsingArgs_ = false;
}