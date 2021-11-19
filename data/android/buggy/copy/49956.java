public io.reactivex.Completable close(final com.dukascopy.api.IOrder order, final double amount, final double price, final double slippage) {
    com.jforex.programming.order.task.TaskExecutor.logger.info("Called complex close");
    return completable(() -> order.close(amount, price, slippage));
}