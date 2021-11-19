public static org.voltdb.importclient.junit.JUnitImporterMessenger initialize() {
    com.google_voltpatches.common.base.Preconditions.checkState(((org.voltdb.importclient.junit.JUnitImporterMessenger.m_self) == null), "JUnitImporterMessenger is already initialized");
    org.voltdb.importclient.junit.JUnitImporterMessenger.m_self = new org.voltdb.importclient.junit.JUnitImporterMessenger();
    org.voltdb.importclient.junit.JUnitImporterMessenger.m_self.m_eventBus.register(org.voltdb.importclient.junit.JUnitImporterMessenger.m_self);
    return org.voltdb.importclient.junit.JUnitImporterMessenger.m_self;
}