public boolean addTradeToQueue(us.textrade.models.Trade trade) {
    if (this.tradesInQueue.contains(trade))
        return this.getTradesInQueue().add(trade);
    
    return false;
}