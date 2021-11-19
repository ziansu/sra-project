private void complete() {
    if (processor.complete()) {
        outbox.add(com.hazelcast.jet.impl.util.DoneItem.DONE_ITEM);
    }else {
        progTracker.notDone();
    }
}