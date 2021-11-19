private void copy(org.apache.activemq.command.ActiveMQTextMessage copy) {
    super.copy(copy);
    copy.text = text;
}