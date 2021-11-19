private void assertError(rx.observers.TestSubscriber sub, java.lang.Class<? extends java.lang.Throwable> errorClass) {
    sub.assertError(errorClass);
    sub.assertNoValues();
    sub.assertUnsubscribed();
}