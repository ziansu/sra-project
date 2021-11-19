@java.lang.Override
public void processMessage(org.apache.pulsar.client.api.Message message) throws java.io.IOException {
    final java.lang.String output = java.lang.String.format(org.apache.pulsar.connect.sink.PrintSinkConnector.OUTPUT_FORMAT, message.getMessageId().toString(), new java.lang.String(message.getData()));
    stream.println(output);
}