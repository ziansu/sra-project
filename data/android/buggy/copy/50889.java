@java.lang.Override
public void afterDeleteDocument(org.exist.storage.DBBroker broker, org.exist.storage.txn.Txn txn, org.exist.xmldb.XmldbURI uri) throws org.exist.collections.triggers.TriggerException {
    final org.exist.config.Configuration conf = org.exist.config.Configurator.getConfigurtion(broker.getBrokerPool(), uri);
    if (conf != null) {
        org.exist.config.Configurator.unregister(conf);
    }
}