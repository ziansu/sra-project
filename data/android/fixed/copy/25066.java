private uk.me.candle.eve.pricing.tests.SynchronousPriceListener startThread() {
    uk.me.candle.eve.pricing.tests.SynchronousPriceListener listener = new uk.me.candle.eve.pricing.tests.SynchronousPriceListener(uk.me.candle.eve.pricing.tests.CancelShutdownTest.pricing, getTypeIDs());
    listener.start();
    return listener;
}