private com.fsck.k9.mail.store.imap.ImapResponseParser createParser(java.lang.String response) {
    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(response.getBytes());
    com.fsck.k9.mail.filter.PeekableInputStream peekableInputStream = new com.fsck.k9.mail.filter.PeekableInputStream(byteArrayInputStream);
    return new com.fsck.k9.mail.store.imap.ImapResponseParser(peekableInputStream);
}