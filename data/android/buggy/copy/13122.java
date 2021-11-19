@java.lang.Override
public void messageChanged(javax.mail.event.MessageChangedEvent e) {
    try {
        log.info(("Message Changed: " + (e.getMessage().getSubject())));
    } catch (javax.mail.MessagingException ex) {
        log.error("Error: ", ex);
    }
}