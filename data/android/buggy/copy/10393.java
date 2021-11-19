@org.jboss.logging.LogMessage(level = ERROR)
@org.jboss.logging.Message(value = "Invalid magic number. Expected %#x and received %#x", id = 4003)
void invalidMagicNumber(java.lang.String message, short expectedMagicNumber, short receivedMagic);