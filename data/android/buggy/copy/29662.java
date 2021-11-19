@java.lang.Override
public void run(java.lang.String... args) throws java.lang.Exception {
    log.info(("Service started with key: " + (apiKey)));
    slackSession.connect();
    slackSession.addMessagePostedListener(helloListener);
}