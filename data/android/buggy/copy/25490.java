@java.lang.Override
public <T> void refresh(java.lang.Class<T> clazz) {
    org.springframework.data.elasticsearch.core.mapping.ElasticsearchPersistentEntity persistentEntity = getPersistentEntityFor(clazz);
    execute(new io.searchbox.indices.Refresh.Builder().addIndex(persistentEntity.getIndexName()).refresh(true).build());
}