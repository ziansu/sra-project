@java.lang.Override
public boolean isStarted() {
    return !(BuildRequestStatus.IN_QUEUE.equals(entity.getStatus()));
}