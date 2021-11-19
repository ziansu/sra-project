@java.lang.Override
public net.openhft.chronicle.engine.api.query.ReadMarshallable apply(java.lang.Class aClass) {
    assert aClass != null;
    return map.computeIfAbsent(aClass, ObjectUtils::newInstance);
}