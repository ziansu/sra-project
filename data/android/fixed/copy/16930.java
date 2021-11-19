public void removeTopic(java.lang.String topic) {
    if (topics.contains(topic))
        topics.remove(topics.indexOf(topic));
    else
        java.lang.System.out.println("No such topic to remove.");
    
}