@org.junit.Before
public void setUp() throws java.lang.Exception {
    lucy = new pt.ieeta.anonymouspatientdata.core.impl.PersistantDataLucene(pt.ieeta.anonymouspatientdata.core.impl.PersistantDataLuceneTest.DEFAULT_ANON_PATH);
    ((pt.ieeta.anonymouspatientdata.core.impl.PersistantDataLucene) (lucy)).setIndexPath(pt.ieeta.anonymouspatientdata.core.impl.PersistantDataLuceneTest.DEFAULT_ANON_PATH);
}