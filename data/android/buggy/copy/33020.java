@java.lang.Override
public void call(rx.CompletableSubscriber actionCompletable) {
    actionCompletable.onSubscribe(action);
    action.call(actualWorker);
    actionCompletable.onCompleted();
}