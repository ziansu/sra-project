private void createAndSendMessage(java.lang.String recipients, java.lang.StringBuilder resultingHtml) {
    java.lang.String subject = "Monthly department salary report";
    javax.mail.internet.MimeMessage resultMessage = mailSender.createMessageWithHTMLCode(resultingHtml.toString(), subject, recipients);
    mailSender.sendMessage(resultMessage);
}