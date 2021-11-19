@java.lang.Deprecated
static org.junit.gen5.engine.junit5.discovery.JUnit5Testable fromUniqueId(java.lang.String uniqueId, java.lang.String engineId) {
    return org.junit.gen5.engine.junit5.discovery.JUnit5Testable.fromUniqueId(org.junit.gen5.engine.UniqueId.parse(uniqueId), org.junit.gen5.engine.UniqueId.forEngine("engine", engineId));
}