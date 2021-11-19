@java.lang.Override
public void success(com.shopify.buy.model.Payment payment) {
    this.checkout = payment.getCheckout();
    callback.success(checkout);
}