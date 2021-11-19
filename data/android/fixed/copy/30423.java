@java.lang.Override
public org.neo4j.unsafe.impl.batchimport.cache.IntArray newIntArray(long length, int defaultValue, long base) {
    return new org.neo4j.unsafe.impl.batchimport.cache.HeapIntArray(org.neo4j.unsafe.impl.batchimport.Utils.safeCastLongToInt(length), defaultValue, base);
}