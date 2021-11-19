public void unwatch(java.lang.String topic) {
    if (watchedTopics.remove(topic))
        storage.saveValueByKeyAndType(watchedTopicsAsString(), "", ValueType.WATCHED_TOPICS);
    
}