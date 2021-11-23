@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void update(java.lang.Iterable<? extends org.molgenis.data.Entity> entities) {
    elasticSearchService.index(entities, getEntityMetaData(), IndexingMode.UPDATE);
    elasticSearchService.refresh(getEntityMetaData());
}