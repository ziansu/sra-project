public java.lang.String getDefaultEmailLabel() {
    defaultEmailLabel = net.whydah.sso.extensions.crmcustomer.helpers.MapKeyValidator.validateKey(defaultEmailLabel, emailaddresses);
    return defaultEmailLabel;
}