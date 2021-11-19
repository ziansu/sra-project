public static org.graylog2.indexer.searches.TimestampStats create(org.joda.time.DateTime min, org.joda.time.DateTime max) {
    return new org.graylog2.indexer.searches.AutoValue_TimestampStats(min, max);
}