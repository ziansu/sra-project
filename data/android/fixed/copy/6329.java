@org.testng.annotations.Test(expectedExceptions = java.lang.NullPointerException.class)
public void ElasticsearchEntityFactory() {
    new org.molgenis.data.elasticsearch.ElasticsearchEntityFactory(null, null);
}