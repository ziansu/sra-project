@java.lang.Override
public void messageChanged(javax.mail.event.MessageChangedEvent e) {
    try {
        java.lang.System.err.println(("Message Changed: " + (e.getMessage().getSubject())));
    } catch (javax.mail.MessagingException ex) {
    }
}