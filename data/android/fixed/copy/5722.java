@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void delete(org.molgenis.data.Entity entity) {
    elasticSearchService.delete(entity, getEntityMetaData());
    elasticSearchService.refresh(getEntityMetaData());
}