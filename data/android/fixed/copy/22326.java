public java.lang.String[] getCcName() {
    if ((ccName) == null)
        ccName = com.github.koshamo.fastmail.mail.MailTools.getCcNames(message);
    
    return ccName;
}