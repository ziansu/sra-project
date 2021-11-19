@org.junit.Test(expected = com.metamx.common.ISE.class)
public void testMustBeStarted() {
    final io.druid.query.lookup.namespace.ExtractionNamespace extractionNamespace = new io.druid.query.lookup.namespace.ExtractionNamespace() {
        @java.lang.Override
        public long getPollMs() {
            return 0;
        }
    };
    final io.druid.query.lookup.NamespaceLookupExtractorFactory namespaceLookupExtractorFactory = new io.druid.query.lookup.NamespaceLookupExtractorFactory(extractionNamespace, cacheManager);
    namespaceLookupExtractorFactory.get();
}