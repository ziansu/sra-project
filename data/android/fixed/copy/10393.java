@org.jboss.logging.LogMessage(level = ERROR)
@org.jboss.logging.Message(value = "Invalid magic number. Expected %#x and received %#x", id = 4003)
void invalidMagicNumber(short expectedMagicNumber, short receivedMagic);