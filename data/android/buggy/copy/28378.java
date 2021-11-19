public void addTopic(java.lang.String topic) {
    for (java.lang.String t : topics) {
        if (t == topic)
            java.lang.System.out.println("Topic is already in the distributionlist.");
        else
            topics.add(topic);
        
    }
}