public boolean deleteTopic(net.sf.json.JSONObject jsonData) throws java.lang.Exception {
    com.bupt.turtleservice.db.TopicDBFunction func = new com.bupt.turtleservice.db.TopicDBFunction(this.transactionOperation);
    java.lang.String topicId = jsonData.getString("topicId");
    func.deleteTopic(topicId);
    return true;
}