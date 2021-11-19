public boolean swapCompactedSegments(org.apache.hadoop.hbase.regionserver.VersionedSegmentsList versionedList, org.apache.hadoop.hbase.regionserver.ImmutableSegment result) {
    return pipeline.swap(versionedList, result);
}