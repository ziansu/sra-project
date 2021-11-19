@java.lang.Override
public java.lang.String getResponse() {
    return responses[new java.util.Random().nextInt(responses.length)];
}