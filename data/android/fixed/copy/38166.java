public static org.voltdb.importclient.junit.JUnitImporterMessenger initialize() {
    if ((org.voltdb.importclient.junit.JUnitImporterMessenger.m_self) == null) {
        org.voltdb.importclient.junit.JUnitImporterMessenger.m_self = new org.voltdb.importclient.junit.JUnitImporterMessenger();
        org.voltdb.importclient.junit.JUnitImporterMessenger.m_self.m_eventBus.register(org.voltdb.importclient.junit.JUnitImporterMessenger.m_self);
    }
    return org.voltdb.importclient.junit.JUnitImporterMessenger.m_self;
}