public void removeTopic(java.lang.String topic) {
    for (java.lang.String t : topics) {
        if (t == topic)
            topics.remove(topics.indexOf(t));
        else
            java.lang.System.out.println("No such topic to remove.");
        
    }
}