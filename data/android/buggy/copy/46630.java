@java.lang.Override
public com.hazelcast.nio.serialization.Data getKeyData() {
    if ((keyData) == null) {
        keyData = serializationService.toData(keyObject);
    }
    return keyData;
}