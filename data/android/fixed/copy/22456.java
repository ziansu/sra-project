private java.lang.String getSqsMessageFromQueue() {
    com.amazonaws.services.sqs.model.Message msg = com.bgu.dsp.awsUtils.SQSUtils.getMessage(inQueueUrl);
    if (msg == null) {
        return null;
    }
    return msg.getBody();
}