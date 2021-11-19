@java.lang.Override
protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
    return new javax.mail.PasswordAuthentication(gpJavaMailProperties.getProperty(JavaMailProp.MAIL_USER.toString()), gpJavaMailProperties.getProperty(JavaMailProp.MAIL_PASSWORD.toString()));
}