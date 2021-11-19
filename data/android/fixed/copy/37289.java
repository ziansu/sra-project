@java.lang.Override
public void add(org.molgenis.data.Entity entity) {
    elasticSearchService.index(entity, getEntityMetaData(), IndexingMode.ADD);
    elasticSearchService.refresh(getEntityMetaData());
}