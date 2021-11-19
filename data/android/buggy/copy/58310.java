public void sendEmail(cz.muni.fi.pv243.mustech.model.NotificationMessage message) {
    sendEmail(message.getDestination(), message.getSubject(), message.getMessage());
    java.lang.System.out.println(("Sending mail to: " + (message.getDestination())));
}