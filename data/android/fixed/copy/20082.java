public void onTick(main.java.jforex.Instrument instrument, main.java.jforex.ITick tick) throws main.java.jforex.JFException {
    if ((trailingStopTrigger) > 0) {
        for (main.java.jforex.IOrder order : engine.getOrders()) {
            updateTrailingStopLoss(order, tick, trailingStopTrigger, trailingStep);
        }
    }
}