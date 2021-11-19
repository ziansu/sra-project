@java.lang.Override
public long getDeliveryDelay() {
    throw new javax.jms.JMSRuntimeException("Pooled JMSProducer cannot use delivery delay");
}