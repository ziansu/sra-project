@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public boolean isBodyAssignableTo(org.apache.activemq.artemis.jms.client.ctiClass c) {
    if ((text) == null)
        return true;
    
    return c.isAssignableFrom(java.lang.String.class);
}