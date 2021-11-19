@java.lang.Override
public void setStrategy(cl.smartcities.isci.transportinspector.map.strategies.Strategy strategy) {
    this.currentStrategy = strategy;
    this.currentStrategy.notifyContextCurrentStrategy();
}