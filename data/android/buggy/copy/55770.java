private void markMessageAsDelivered(java.lang.String oldId, boolean read) {
    updateMessage(oldId, (read ? MonkeyItem.DeliveryStatus.read : MonkeyItem.DeliveryStatus.delivered));
}