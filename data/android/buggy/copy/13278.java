@java.lang.Override
public org.neo4j.unsafe.impl.batchimport.cache.ByteArray newByteArray(long length, byte[] defaultValue, long base) {
    return new org.neo4j.unsafe.impl.batchimport.cache.HeapByteArray(org.neo4j.unsafe.impl.batchimport.Utils.safeCastLongToInt(length), defaultValue, java.lang.Math.toIntExact(base));
}