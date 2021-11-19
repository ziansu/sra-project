@java.lang.Override
public void request(long n) {
    if (n <= (java.lang.Integer.MAX_VALUE)) {
        rsSubscription.request(((int) (n)));
    }else {
        rsSubscription.request(java.lang.Integer.MAX_VALUE);
    }
}