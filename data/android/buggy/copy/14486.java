@org.junit.Test
public void testAnnotateDefault() throws java.lang.Exception {
    org.opencb.opencga.analysis.storage.variant.VariantStorage variantStorage = new org.opencb.opencga.analysis.storage.variant.VariantStorage(catalogManager);
    variantStorage.annotateVariants(studyId, outputId, sessionId, new org.opencb.commons.datastore.core.QueryOptions(org.opencb.opencga.analysis.AnalysisJobExecutor.EXECUTE, true));
    checkAnnotation(( v) -> true);
}