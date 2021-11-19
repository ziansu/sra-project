public void sendMessage(java.lang.String title, java.lang.Object message) {
    SmartGrid.SimpleMessageManager.MessageTopic target = getByTitle(title);
    if (target == null) {
        for (SmartGrid.iMessageClient item : target.subscribers) {
            item.messageReceived(title, message);
        }
    }
}