public void addTopic(java.lang.String topic) {
    if (topics.contains(topic))
        java.lang.System.out.println("Topic is already in the distributionlist.");
    else
        topics.add(topic);
    
}