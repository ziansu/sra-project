@java.lang.Override
public java.lang.String toYaml(org.zanata.sync.model.SyncWorkConfig syncWorkConfig) {
    org.zanata.sync.dao.SyncWorkConfigSerializerImpl.YAML.setBeanAccess(BeanAccess.FIELD);
    return org.zanata.sync.dao.SyncWorkConfigSerializerImpl.YAML.dump(syncWorkConfig);
}