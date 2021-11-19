private uk.me.candle.eve.pricing.tests.SynchronousPriceListener startThread(boolean all) {
    uk.me.candle.eve.pricing.tests.SynchronousPriceListener listener = new uk.me.candle.eve.pricing.tests.SynchronousPriceListener(uk.me.candle.eve.pricing.tests.CancelShutdownTest.pricing, getTypeIDs(all));
    listener.start();
    return listener;
}