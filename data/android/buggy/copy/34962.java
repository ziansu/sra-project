@java.lang.Override
public void onSuccess(com.amazonaws.services.sqs.model.ReceiveMessageRequest request, com.amazonaws.services.sqs.model.ReceiveMessageResult result) {
    process(result.getMessages());
    status.lazySet(CheckResult.OK);
    run();
}