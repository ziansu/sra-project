@java.lang.Override
public void onCTPCallback(com.android.futures.entity.TradeEntity entity) {
    mMdSequence.add(entity);
    if ((entity.getType()) != (TradeEntity.type.MD)) {
        onTradeNotification(entity);
    }
}