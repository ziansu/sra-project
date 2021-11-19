protected java.lang.Object getFieldValue(org.apache.storm.tuple.ITuple tuple) {
    com.hortonworks.streamline.streams.StreamlineEvent streamlineEvent = ((com.hortonworks.streamline.streams.StreamlineEvent) (tuple.getValueByField(StreamlineEvent.STREAMLINE_EVENT)));
    return streamlineEvent.get(field);
}