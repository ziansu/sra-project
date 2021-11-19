private org.json.JSONObject pingLeader(int type, java.lang.String topicName, java.lang.String notifyMsg) {
    org.json.JSONObject notification = new org.json.JSONObject();
    createNotification(type, topicName, notifyMsg, notification, new org.json.JSONObject());
    return notification;
}