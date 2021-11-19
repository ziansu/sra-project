public void addTopics(java.util.Collection<java.lang.String> topicCollection) {
    topicsString += topicCollection.stream().map(java.lang.String::trim).collect(java.util.stream.Collectors.joining(","));
}