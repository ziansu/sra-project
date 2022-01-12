private void toggleTrading() {
    notate.remoteToggleImprovise();
    if (trading) {
        tradingStopped();
    }else {
        tradingStarted();
    }
}