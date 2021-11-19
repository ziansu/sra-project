public void CompleteTurn(me.gandhiinc.blindeye.Plot[] plots, me.gandhiinc.blindeye.MarketPlace market) {
    AIAcquirePlot(plots);
    AIAcquireRoboticon(market);
    ProduceResources();
    SellResources(market);
}