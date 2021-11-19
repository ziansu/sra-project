@java.lang.Override
public void create() {
    elasticSearchService.createMappings(getEntityMetaData());
}