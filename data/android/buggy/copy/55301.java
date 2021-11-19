protected java.lang.String getCustomerUUID(com.sixsq.slipstream.persistence.User user) throws com.sixsq.slipstream.exceptions.ValidationException {
    java.lang.String s = user.getParameter(constructKey(FCOUserParametersFactory.PARAM_CUSTOMER_UUID)).getValue();
    return s;
}