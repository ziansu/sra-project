@java.lang.Override
public void subscribeOnTopics() {
    com.stratelia.silverpeas.silverpeasinitialize.CallBackManager callBackManager = com.stratelia.silverpeas.silverpeasinitialize.CallBackManager.get();
    callBackManager.subscribeAction(CallBackManager.ACTION_BEFORE_REMOVE_COMPONENT, this);
    subscribeForNotifications(com.silverpeas.notification.NotificationTopic.onTopic(com.silverpeas.pdc.service.NODE_TOPIC.getTopicName()));
}