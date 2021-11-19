private static java.lang.String toDeliveryModeString(final int deliveryMode) {
    switch (deliveryMode) {
        case javax.jms.Session.AUTO_ACKNOWLEDGE :
            return "AUTO_ACKNOWLEDGE";
        case javax.jms.Session.CLIENT_ACKNOWLEDGE :
            return "CLIENT_ACKNOWLEDGE";
        case javax.jms.Session.DUPS_OK_ACKNOWLEDGE :
            return "DUPS_OK_ACKNOWLEDGE";
        default :
            return "UNKNOWN";
    }
}