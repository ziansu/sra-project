public void addTopics(java.util.Collection<java.lang.String> topicCollection) {
    addTopics(topicCollection.stream().map(java.lang.String::trim).collect(java.util.stream.Collectors.joining(",")));
}