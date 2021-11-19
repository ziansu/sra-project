@java.lang.Override
public org.neo4j.unsafe.impl.batchimport.cache.LongArray newLongArray(long length, long defaultValue, long base) {
    return new org.neo4j.unsafe.impl.batchimport.cache.HeapLongArray(org.neo4j.unsafe.impl.batchimport.Utils.safeCastLongToInt(length), defaultValue, java.lang.Math.toIntExact(base));
}