@java.lang.Override
public void afterPropertiesSet() throws java.lang.Exception {
    updateInitAndCreateBindingAndCommentsVSForDatatype();
    updateInitAndCreateBindingAndCommentsVSForSegment();
    updateInitAndCreateCommentsForMessage();
    updateUserExportConfigs();
}