@java.lang.Override
public org.killbill.billing.control.plugin.api.OnSuccessPaymentControlResult onSuccessCall(final org.killbill.billing.control.plugin.api.PaymentControlContext paymentControlContext, final java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty> properties) throws org.killbill.billing.control.plugin.api.PaymentControlApiException {
    return new org.killbill.billing.payment.retry.DefaultOnSuccessPaymentControlResult(getAdjustedProperties(properties, newOnResultProperties, removedOnResultProperties));
}