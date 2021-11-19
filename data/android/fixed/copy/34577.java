@java.lang.Override
public void unsubscribeOnTopics() {
    unsubscribeForNotifications(com.silverpeas.notification.NotificationTopic.onTopic(com.silverpeas.pdc.service.NODE_TOPIC.getTopicName()));
}