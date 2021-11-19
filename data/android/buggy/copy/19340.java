@java.lang.Override
public void run() {
    if ((message.getDeliveryStatus()) == (MonkeyItem.DeliveryStatus.sending)) {
        message.setDeliveryStatus(MonkeyItem.DeliveryStatus.error);
        adapter.rebindMonkeyItem(position, recycler);
    }
}