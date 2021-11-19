public java.util.Set<com.uci.mode.IndexEntry> getIndexEntities(java.lang.String term) {
    java.util.Set<com.uci.mode.IndexEntry> termPoses = indexMap.get(term);
    return termPoses == null ? new java.util.HashSet<>() : termPoses;
}