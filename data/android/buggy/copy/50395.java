@java.lang.Override
public java.lang.String decorate(com.acme.edu.message.Message message) throws com.acme.edu.exceptions.DecorateException {
    try {
        return (getContent(message)) + (getPostfix(message));
    } catch (com.acme.edu.exceptions.ContentDecorateException e) {
        throw new com.acme.edu.exceptions.DecorateException("Can\'t decorate message", e);
    }
}