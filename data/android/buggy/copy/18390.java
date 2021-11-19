public void closeTransport() {
    try {
        if ((transport) != null) {
            transport.get().close();
            transport.set(null);
        }
    } catch (javax.mail.MessagingException e) {
    }
}