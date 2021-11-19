@java.lang.Override
public void run() {
    invisibleMessageReactivationTasks.remove(msg.getReceiptHandle());
    reactivatedMessagesMap.put(msg.getReceiptHandle(), msg);
    q.addFirst(msg);
}