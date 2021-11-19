@java.lang.Override
public void run() {
    reactivatedMessagesMap.put(msg.getReceiptHandle(), msg);
    q.addFirst(msg);
    invisibleMessageReactivationTasks.remove(msg.getReceiptHandle());
}