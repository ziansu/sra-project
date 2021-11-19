@java.lang.Override
public com.hazelcast.nio.serialization.Portable create(int classId) {
    switch (classId) {
        case ComplexDomainObject.PORTABLE_CLASS_ID :
            return new com.hazelcast.simulator.tests.map.helpers.ComplexDomainObject();
    }
    return null;
}