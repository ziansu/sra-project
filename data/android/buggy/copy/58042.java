@java.lang.Override
public org.zanata.sync.model.SyncWorkConfig fromYaml(java.lang.String yaml) {
    org.zanata.sync.dao.SyncWorkConfigSerializerImpl.YAML.setBeanAccess(BeanAccess.FIELD);
    return ((org.zanata.sync.model.SyncWorkConfig) (org.zanata.sync.dao.SyncWorkConfigSerializerImpl.YAML.load(yaml)));
}