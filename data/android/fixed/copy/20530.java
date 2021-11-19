public static java.lang.String getMessageBody(java.lang.String message) {
    if (message.contains("_"))
        return message.substring(((message.lastIndexOf("_")) + 1));
    else
        return message;
    
}