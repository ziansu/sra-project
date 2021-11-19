@java.lang.Override
public void unsubscribeOnTopics() {
    com.stratelia.silverpeas.silverpeasinitialize.CallBackManager callBackManager = com.stratelia.silverpeas.silverpeasinitialize.CallBackManager.get();
    callBackManager.unsubscribeAll(this);
    unsubscribeForNotifications(com.silverpeas.notification.NotificationTopic.onTopic(com.silverpeas.pdc.service.NODE_TOPIC.getTopicName()));
}