@java.lang.Override
public void setEncoding(java.lang.String encoding) throws com.fsck.k9.mail.MessagingException {
    setHeader(MimeHeader.HEADER_CONTENT_TRANSFER_ENCODING, encoding);
}