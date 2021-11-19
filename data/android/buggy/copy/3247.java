public void swapCompactedSegments(org.apache.hadoop.hbase.regionserver.VersionedSegmentsList versionedList, org.apache.hadoop.hbase.regionserver.ImmutableSegment result) {
    pipeline.swap(versionedList, result);
}