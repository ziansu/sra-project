public boolean swapCompactedSegments(org.apache.hadoop.hbase.regionserver.VersionedSegmentsList versionedList, org.apache.hadoop.hbase.regionserver.ImmutableSegment result, boolean merge) {
    return pipeline.swap(versionedList, result, (!merge), true);
}