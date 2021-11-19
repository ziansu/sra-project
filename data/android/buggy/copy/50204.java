@java.lang.Override
public void unsetGiveValue() {
    inputResource = null;
    ratio = 0;
    this.tradeOverlay.setTradeEnabled(false);
    this.tradeOverlay.hideGetOptions();
    this.tradeOverlay.reset();
    this.tradeOverlay.showGiveOptions(enabledResources);
}